/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw;

import java.awt.Graphics2D;

/**
 *
 * @author wetteifer
 */
public interface Drawable {

    void update(long delta);

    void draw(Graphics2D g);

}
