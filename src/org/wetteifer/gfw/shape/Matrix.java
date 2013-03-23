/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.wetteifer.gfw.GameUtils;
import org.wetteifer.gfw.ImageSurface;

/**
 *
 * @author wetteifer
 */
public class Matrix extends Entity implements ImageSurface {

    private static final Map<String, BufferedImage> IMAGE_CACHE
               = new HashMap<String, BufferedImage>();

    private int width, height;
    private int size;
    private int[][] matrix;

    private BufferedImage image;
    private String name;
    private Color color;
    
    public Matrix() {
        super(0.0f, 0.0f);
    }

    public Matrix(float x, float y, int[][] m, int w, int h, int s, Color c, String n, boolean createImage) {
        super(x, y);
        
        if (m == null) {
            throw new NullPointerException("matrix is null");
        }
        
        if (w <= 0 || h <= 0) {
            throw new IllegalArgumentException("width and height must be greater than zero.");
        }
        
        if (s <= 0) {
            throw new IllegalArgumentException("size must be greater than zero.");
        }

        this.matrix = m;
        this.width  = w;
        this.height = h;
        this.size   = s;
        this.color  = c;
        this.name   = n;

        if (createImage) {
            create();
        }
    }
    
    public Matrix(float x, float y, int[][] m, int w, int h, int s, Color c, String n) {
        this(x, y, m, w, h, s, c, n, true);
    }
    
    public Matrix(int[][] m, int w, int h, int s, Color c, String n) {
        this(0.0f, 0.0f, m, w, h, s, c, n);
    }

    public Matrix(float x, float y) {
        super(x, y);
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

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public void setCacheName(String name) {
        this.name = name;
    }
    
    public String getCacheName() {
        return name;
    }

    public void setMatrix(int[][] matrix, int width, int height) {
        this.matrix = matrix;
        this.width = width;
        this.height = height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public static void clear() {
        Collection<BufferedImage> images = IMAGE_CACHE.values();

        for (BufferedImage image : images) {
            image.flush();
        }

        IMAGE_CACHE.clear();
    }

    private void create() {
        if (name != null) {
            BufferedImage cache = IMAGE_CACHE.get(name);
            if (cache != null) {
                image = cache;
                return;
            }
        }

        boolean singleColor = (color != null);

        if (image != null) {
            image.flush();
        }

        image = GameUtils.createCompatibleImage(width * size, height * size);

        Graphics g = image.createGraphics();
        int c = matrix[0][0];

        if (singleColor) {
            g.setColor(color);
        } else {
            g.setColor(new Color(c));
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (singleColor) {
                    if (matrix[i][j] == 0) {
                        continue;
                    }
                } else {
                    if (c != matrix[i][j]) {
                        c  = matrix[i][j];
                        g.setColor(new Color(c));
                    }
                }
                g.fillRect(i * size, j * size, size, size);
            }
        }

        g.dispose();

        if (name != null) {
            IMAGE_CACHE.put(name, image);
        }
    }

}
