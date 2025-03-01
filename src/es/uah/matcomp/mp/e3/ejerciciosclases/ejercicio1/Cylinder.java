package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio1;

public class Cylinder extends Circle {
    private double height;

    // Constructor con color, radio y altura por defecto
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // Constructor con radio y color por defecto, pero altura especificada
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor con color por defecto, pero radio y altura especificados
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Metodo público para obtener la altura
    public double getHeight() {
        return this.height;
    }

    // Sobrescribir metodo para obtener el área superficial del cilindro
    @Override
    public double getArea() {
        // Área lateral + 2 * área de la base
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Metodo público para calcular el volumen del cilindro
    public double getVolume() {
        // Utiliza el metodo getArea de esta clase (que ya tiene en cuenta las áreas de las bases)
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}

