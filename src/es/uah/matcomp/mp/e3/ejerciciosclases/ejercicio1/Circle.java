package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c) { // 3rd constructor
        this.radius = r;
        this.color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    /** Returns the color of this Circle instance */
    public String getColor() {
        return this.color;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    /** Returns the circumference of this Circle instance */
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}