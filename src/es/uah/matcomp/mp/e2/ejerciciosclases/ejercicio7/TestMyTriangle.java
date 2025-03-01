package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio7;


public class TestMyTriangle {
    public static void main(String[] args) {
        //Triangulo1 Con todas las funciones
        MyTriangle triangle1 = new MyTriangle(0, 0, 2, 0, 1, 2);
        System.out.println(triangle1); // Muestra los puntos del triángulo
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());
        //Triangulo2 Para tener los dos Contructores
        MyTriangle triangle2 = new MyTriangle( new MyPoint(2, 2), new MyPoint(4, 4), new MyPoint(1, 1));
        System.out.println(triangle2);
    }
}


