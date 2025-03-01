package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio4;


public class TestMyPoint {
    public static void main(String[] args) {
        // Test constructor
        MyPoint p1 = new MyPoint();
        System.out.println(p1);  // toString()

        // Test setters
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // getX()
        System.out.println("y is: " + p1.getY());  // getY()

        // Test setXY() y getXY()
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);  // getXY()[0]
        System.out.println(p1.getXY()[1]);  // getXY()[1]
        System.out.println(p1);  // toString()

        // Test constructor
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);  // toString()

        // Probando los métodos de distancia
        System.out.println(p1.distance(p2));    // distancia(MyPoint another)
        System.out.println(p2.distance(p1));    // distancia(MyPoint another)
        System.out.println(p1.distance(5, 6));  // distancia(int x, int y)
        System.out.println(p1.distance());      // distancia al origen





        // Crear un array de 10 puntos MyPoint y mostrar la matriz de distancias
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        System.out.println("Matriz de distancias:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%.2f ", points[i].distance(points[j]));
            }
            System.out.println();
        }
    }
}



