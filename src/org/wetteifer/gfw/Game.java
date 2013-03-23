/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author wetteifer
 */
public abstract class Game extends Thread {

    private static Toolkit toolkit = Toolkit.getDefaultToolkit();

    private JFrame frame;
    private BufferStrategy buffer;
    private Color background;
    private int width, height;
    private boolean running = true;
    private boolean paused = false;

    public Game(String title, int width, int height, Color background) {
        init(title, width, height, background);
    }

    private void init(String title, int w, int h, Color b) {
        this.width = w;
        this.height = h;
        this.background = b;

        load();

        frame = new JFrame(title);
        frame.setIgnoreRepaint(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        Canvas canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setIgnoreRepaint(true);

        frame.add(canvas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        buffer = canvas.getBufferStrategy();

        KeyboardFocusManager keyManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        keyManager.addKeyEventPostProcessor(new KeyEventPostProcessor() {
            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
                switch (e.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        keyPressed(e);
                        break;
                    case KeyEvent.KEY_RELEASED:
                        keyReleased(e);
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public void run() {
        final long EXPECTED_ELAPSED_TIME = 1000L / 30L;

        Graphics g = null;
        Graphics2D g2 = null;

        BufferedImage screen = GameUtils.createCompatibleImage(width, height);

        long frameTime = 0;
        long elapsedTime = 0;
        long currentTime = 0;
        long lastTime = System.currentTimeMillis();

        while (running) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;

            if (elapsedTime <= 0) {
                continue;
            }

            while (elapsedTime > 0 && !paused) {
                frameTime = elapsedTime;

                if (frameTime > EXPECTED_ELAPSED_TIME) {
                    frameTime = EXPECTED_ELAPSED_TIME;
                }

                update(frameTime);

                elapsedTime -= frameTime;
            }

            try {
                g2 = screen.createGraphics();

                g2.setColor(background);
                g2.fillRect(0, 0, width, height);

                draw(g2);

                g = buffer.getDrawGraphics();
                g.drawImage(screen, 0, 0, null);

                if (!buffer.contentsLost()) {
                    buffer.show();
                }

                toolkit.sync();
            }
            
            catch (Exception e) {
                
            }
            
            finally {
                if (g != null) {
                    g.dispose();
                }
                if (g2 != null) {
                    g2.dispose();
                }
            }

            lastTime = currentTime;
        }
    }

    public abstract void load();

    public abstract void update(long delta);

    public abstract void draw(Graphics2D g);

    public abstract void unload();

    public abstract void keyPressed(KeyEvent e);

    public abstract void keyReleased(KeyEvent e);

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void pause() {
        paused = !paused;
    }

    public void setPause(boolean value) {
        paused = value;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public Color getBackground() {
        return background;
    }

    public void exit() {
        running = false;

        frame.dispose();
        buffer.dispose();

        unload();
        
        System.exit(0);
    }

}
