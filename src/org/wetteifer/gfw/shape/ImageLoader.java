/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.shape;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.wetteifer.gfw.GameUtils;
import org.wetteifer.gfw.ResourceLoader;

/**
 *
 * @author wetteifer
 */
public class ImageLoader extends ResourceLoader<BufferedImage> {

    private static ImageLoader cache;

    private ImageLoader() {}

    public static ImageLoader getImageLoader() {
        if (cache == null) {
            cache = new ImageLoader();
        }
        return cache;
    }

    @Override
    protected BufferedImage load(URL url) {
        BufferedImage image = null;

        try {
            BufferedImage source = ImageIO.read(url);
            image = GameUtils.createCompatibleImage(source.getWidth(), source.getHeight());
            Graphics2D g = image.createGraphics();
            g.drawImage(image, 0, 0, null);
        } catch (IOException e) {}

        return image;
    }

}
