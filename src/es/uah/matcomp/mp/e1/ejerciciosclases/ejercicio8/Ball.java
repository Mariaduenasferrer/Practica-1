package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio8;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball ( float x, float y, int radius, float xdelta, float ydelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xdelta;
        this.yDelta = ydelta;
    }
    public float getX() {
        return x;
    }
    public void setX(float newx) {
        x = newx;
    }
    public float getY() {
        return y;
    }
    public void setY(float newy) {
        y = newy;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int newradius) {
        radius = newradius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float newxDelta) {
        xDelta = newxDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float newyDelta) {
        yDelta = newyDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }

}

