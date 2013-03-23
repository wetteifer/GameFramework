/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.text;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.wetteifer.gfw.GameUtils;
import org.wetteifer.gfw.ImageSurface;
import org.wetteifer.gfw.shape.Entity;

/**
 *
 * @author wetteifer
 */
public class Text extends Entity implements ImageSurface {

    private BufferedImage image;
    private String text;
    private Font font;
    private Color color;
    private int size;

    public Text(String text, Font font, Color color, int size) {
        super(0, 0);

        this.text = text;
        this.font = font;
        this.color = color;
        this.size = size;

        create();
    }

    public Text(String text, Color color, int size) {
        this(text, new Notalot35(), color, size);
    }

    @Override
    public int getWidth() {
        return image.getWidth();
    }

    @Override
    public int getHeight() {
        return image.getHeight();
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(image, (int) x, (int) y, null);
    }

    @Override
    public BufferedImage getImage() {
        return image;
    }

    @Override
    public void createImage() {
        create();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void create() {
        char[] chars = text.toCharArray();
        int tx, ty, cw, ch;

        tx = 0;                      // Coordenada x.
        ty = 0;                      // Coordenada y.
        cw = font.getMatrixWidth();  // Numero de cuadrados horizontalmente.
        ch = font.getMatrixHeight(); // Numero de cuadrados verticalmente.

        // Liberar recursos de la imagen anterior.
        if (image != null) {
            image.flush();
        }

        // Crear una imagen con las dimensiones del texto.
        image = GameUtils.createCompatibleImage(
                font.getStringWidth(chars)  * size,
                font.getStringHeight(chars) * size);

        Graphics g = image.createGraphics();
        g.setColor(color);

        // Dibujar cada letra.
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int fw = font.getFixedCharWidth(c);
            int fh = font.getFixedCharHeight(c);
            byte[][] charMatrix = font.getMatrix(c);

            for (int j = 0; j < cw; j++) {
                for (int k = 0; k < ch; k++) {
                    if (charMatrix[j][k] != 0) {
                        g.fillRect(tx + j * size, fh * size + k * size, size, size);
                    }
                }
            }

            // Recorrer la posicion hacia el siguiente caracter.
            tx += (cw - fw) * size;

            // TODO: Añadir soporte para saltos de linea.
        }

        g.dispose();
    }

}
