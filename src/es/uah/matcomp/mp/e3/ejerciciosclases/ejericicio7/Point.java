package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

public class Point {
    // Private variables
    private int x;      // x co-ordinate
    private int y;      // y co-ordinate

    // Constructor
    public Point(int X, int Y) {
        x = X;
        y = Y;
    }

    // Public methods
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int NewX) {
        x = NewX;
    }

    public void setY(int NewY) {
        y = NewY;
    }

    public void setXY(int NewX, int NewY) {
        x = NewX;
        y = NewY;
    }
}
