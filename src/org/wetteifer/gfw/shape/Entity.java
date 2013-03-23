/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.shape;

import org.wetteifer.gfw.Drawable;

/**
 *
 * @author wetteifer
 */
public abstract class Entity extends Shape implements Drawable {

    protected float dx, dy;

    public Entity(float x, float y, float dx, float dy) {
        super(x, y);
        this.dx = dx;
        this.dy = dy;
    }

    public Entity(float x, float y) {
        this(x, y, 0, 0);
    }

    @Override
    public void update(long delta) {
        x += delta * dx / 1000;
        y += delta * dy / 1000;
    }

    public float getXSpeed() {
        return dx;
    }

    public void setXSpeed(float dx) {
        this.dx = dx;
    }

    public float getYSpeed() {
        return dy;
    }

    public void setYSpeed(float dy) {
        this.dy = dy;
    }

}
