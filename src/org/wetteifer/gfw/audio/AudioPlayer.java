/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.audio;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.wetteifer.gfw.ResourceLoader;
import org.wetteifer.gfw.audio.AudioPlayer.Audio;

/**
 *
 * @author wetteifer
 */
public final class AudioPlayer extends ResourceLoader<Audio> {

    class Audio {

        private byte[] bytes;
        private AudioFormat format;

        Audio(byte[] bytes, AudioFormat format) {
            this.bytes = bytes;
            this.format = format;
        }

        public byte[] getBytes() {
            return bytes;
        }

        public AudioFormat getFormat() {
            return format;
        }

    }

    private class AudioThread extends Thread {

        private static final int AUDIO_BUFFER_SIZE = 1024;

        private Audio audio;
        private boolean loop;
        private boolean running;

        public AudioThread(String name) {
            this.audio = get(name);
        }

        public void finish() {
            running = false;
            loop = false;
        }

        public boolean isRunning() {
            return running;
        }

        public void setLoop(boolean value) {
            loop = value;
        }

        @Override
        public void run() {
            running = true;
            do {
                SourceDataLine line;
                AudioInputStream stream;

                AudioFormat format = audio.getFormat();
                DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

                try {
                    line = (SourceDataLine) AudioSystem.getLine(info);
                    
                    if (!line.isOpen()) {
                        line.open(format);
                    }

                    stream = new AudioInputStream(
                         new ByteArrayInputStream(audio.getBytes()),
                         format, AudioSystem.NOT_SPECIFIED);

                    line.start();

                    int read = 0;
                    byte[] buffer = new byte[AUDIO_BUFFER_SIZE];

                    while (read != -1 && running) {
                        read = stream.read(buffer, 0, buffer.length);
                        if (read >= 0) {
                           line.write(buffer, 0, read);
                        }
                    }

                    line.drain();
                    line.stop();
                    line.close();
                    line = null;

                    stream.close();
                    stream = null;
                } catch (LineUnavailableException e) {
                } catch (IOException e) {
                }
            } while (loop);
        }

    }

    private static AudioPlayer audioPlayer;

    private Map<String, AudioThread> threads;

    private AudioPlayer() {
        threads = new HashMap<String, AudioThread>();
    }

    public static AudioPlayer getAudioPlayer() {
        if (audioPlayer == null) {
            audioPlayer = new AudioPlayer();
        }
        return audioPlayer;
    }

    @Override
    protected Audio load(URL url) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(url);

            // Obtener el tamaño del archivo de audio.
            File file = new File(url.getFile());
            int length = (int) file.length();

            // Crear un buffer de audio.
            Audio audio;
            byte[] buffer = new byte[length];

            // Leer los contenidos del flujo de audio dentro del buffer.
            ais.read(buffer);

            // Crear nuestro flujo de audio reusable.
            audio = new Audio(buffer, ais.getFormat());

            // Cerrar el flujo.
            ais.close();
            ais = null;

            return audio;
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException("Can't load the audio file.");
        } catch (IOException e) {
            throw new RuntimeException("Can't load the audio file.");
        }
    }

    @Override
    public void clear() {
        super.clear();
        threads.clear();
    }

    public void load(String name) {
        if (!threads.containsKey(name)) {
            threads.put(name, new AudioThread(name));
        }
    }

    public void play(String name) {
        AudioThread audio = threads.get(name);

        if (audio != null) {
            threads.remove(name);
            audio.finish();
            audio = null;
        }

        audio = new AudioThread(name);
        threads.put(name, audio);
        audio.start();
    }

    public void stop(String name) {
        AudioThread audio = threads.get(name);
        if (audio != null) {
            threads.remove(name);
            audio.finish();
            audio = null;
        }
    }

    public void loop(String name) {
        AudioThread audio = threads.get(name);

        if (audio != null) {
            if (audio.isRunning()) {
                return;
            }
        }

        audio = new AudioThread(name);
        audio.setLoop(true);
        threads.put(name, audio);
        audio.start();
    }

}
