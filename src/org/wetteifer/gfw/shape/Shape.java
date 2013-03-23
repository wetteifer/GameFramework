/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.shape;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author wetteifer
 */
public abstract class Shape {

    protected float x, y;

    public Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getWidth();

    public abstract int getHeight();

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setLocation(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D getLocation() {
        return new Point2D.Float(getX(), getY());
    }

    public Rectangle2D getRectangle() {
        return new Rectangle.Float(getX(), getY(), getWidth(), getHeight());
    }

}
