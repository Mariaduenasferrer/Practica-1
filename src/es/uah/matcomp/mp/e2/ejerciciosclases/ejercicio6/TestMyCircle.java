package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio6;


import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        //Usar Contructores (Circulo 3 y 4)
        MyCircle myCircle3= new MyCircle();
        System.out.println(myCircle3);
        myCircle3.setRadius(10);
        myCircle3.setCenter(new MyPoint(2,3));
        System.out.println(myCircle3);
        myCircle3.setX(3);
        myCircle3.setY(3);
        System.out.println(myCircle3);
        myCircle3.setCenterXY( 3, 4);
        MyCircle myCircle4 = new MyCircle(new MyPoint(2,3), 4);
        System.out.println(myCircle4);
        //Datos Circulo1
        MyCircle myCircle1 = new MyCircle(2, 3, 4);
        System.out.println(myCircle1);
        System.out.println("X is: " + myCircle1.getX());
        System.out.println("Y is: " + myCircle1.getY());
        System.out.println("Radius is: " + myCircle1.getRadius());
        System.out.println("Center is: " + myCircle1.getCenter());
        System.out.println("CenterXY is: " + Arrays.toString(myCircle1.getCenterXY()));
        System.out.println("Area is: " + myCircle1.getArea());
        System.out.println("Circumference is: " + myCircle1.getCircumference());
        //Datos Circulo2
        MyCircle myCircle2 = new MyCircle(5, 5, 2);
        System.out.println(myCircle2);
        System.out.println("Area is: " + myCircle2.getArea());
        System.out.println("Circumference is: " + myCircle2.getCircumference());
        //Probar Distancia entre centros
        System.out.println("Distance is: " + myCircle1.distance(myCircle2));
    }
}


