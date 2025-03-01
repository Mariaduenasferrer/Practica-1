package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point


    // Constructors
    public Line(Point b, Point e) {   // caller to construct the Points
        begin = b;
        end = e;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);    // construct the Points here
    }
    // Public methods
    @Override
    public String toString() {
        return "Line from " + begin + " to " + end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point NewBegin) {
        begin = NewBegin;
    }

    public void setEnd(Point NewEnd) {
        end = NewEnd;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);  // Length of the line
                                                                    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);    // Gradient in radians
                                                // Math.atan2(yDiff, xDiff)
    }
}
