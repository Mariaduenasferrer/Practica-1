package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio6;


public class MyCircle {
    private MyPoint center;
    private int radius;

    //Contructores
    public MyCircle() {
        this.center = new MyPoint();
        this.radius = 1;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    //Get y Set de las variables
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getX() {
        return center.getX();
    }
    public void setX(int x) {
        this.center.setX(x);
    }

    public int getY() {
        return center.getY();
    }
    public void setY(int y) {
        this.center.setY(y);
    }

    //Resto de Codigo
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[radius=" + radius + ", center= ("+ center +"]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}


