/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

/**
 *
 * @author wetteifer
 */
public class GameUtils {

    private static final GraphicsConfiguration GRAPHIC_CONFIG =
            GraphicsEnvironment.getLocalGraphicsEnvironment()
                               .getDefaultScreenDevice()
                               .getDefaultConfiguration();

    public static BufferedImage createCompatibleImage(int width, int height) {
        return GRAPHIC_CONFIG.createCompatibleImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

}
