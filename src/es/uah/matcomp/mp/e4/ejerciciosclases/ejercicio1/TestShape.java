package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape - Polimorfismo
        System.out.println(s1); // which version? - Circle
        System.out.println(s1.getArea()); // which version? - Circle
        System.out.println(s1.getPerimeter()); // which version? - Circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        //(Se produce un error en getRadius, porque Shape no tiene el metodo getRadius())

        // Downcast back to Circle
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println((c1).getArea());
        System.out.println((c1).getPerimeter());
        System.out.println((c1).getColor());
        System.out.println((c1).isFilled());
        System.out.println((c1).getRadius());
        (c1).setRadius(4);
        System.out.println((c1).getRadius());

        //Shape s2 = new Shape();
        //Shape es una clase abstracta, por lo que no se puede ejecutar

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        //(Se produce un error en getLength, porque el Shape no tiene el metodo getLength())

        // downcast
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s3.getSide());
        //(Se produce un error en getSide, porque Shape no tiene el metodo getSide())

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        //(Se produce un error, porque Rectangle no tiene el metodo getSide())
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        //Programa añadido

        Shape s5 = new Shape("blue", true) {
            @Override
            public double getArea() {
                return 0;
            }
            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        System.out.println(s5);

        Shape s6 = new Circle(); //Upcast Circle to Shape
        s6.setColor("Blue");
        s6.setFilled(true);
        System.out.println(s6.getColor());
        System.out.println(s6.isFilled());

        Shape s7 = new Circle(5.5);// Upcast Circle to Shape
        System.out.println(s7); // which version?

        Shape s8 = new Square();
        System.out.println(s8);

        Square s9 = new Square(3, "red", false);
        System.out.println(s9);
        System.out.println(s9.getArea());
        System.out.println(s9.getPerimeter());
        System.out.println(s9.getColor());
        s9.setSide(3);
        System.out.println(s9.getSide());
    }
    //En tus palabras, ¿para qué sirven las clases abstractas y los métodos abstractos?
    //Las clases abstractas sirven para no estar realizando pruebas de cada clase que empleemos, solo necesitamos
    // crear una clase abstracta a la cual se le añade funciones empleando otras clases.
    //Los métodos abstractos sirven para que los métodos de clases derivadas, empleen la misma estructura
}