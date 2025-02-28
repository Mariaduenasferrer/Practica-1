package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TestMovable {
    public static void main(String[] args) {
        // Crear un punto
        PointMovable.Point point = new PointMovable.Point(2.5f, 3.5f);
        System.out.println("Point: " + point);

        // Cambiar las coordenadas del punto
        point.setXY(4.5f, 5.5f);
        System.out.println("Updated Point: " + point);

        // Crear un punto móvil
        PointMovable.Movable movable = new PointMovable.Movable(1.0f, 2.0f, 0.5f, 1.0f);
        System.out.println("Movable: " + movable);

        // Mover el punto móvil
        movable.move();
        System.out.println("Moved Movable: " + movable);

        // Cambiar la velocidad y mover el punto móvil nuevamente
        movable.setSpeed(1.5f, 2.5f);
        movable.move();
        System.out.println("Updated and Moved Movable: " + movable);
    }
}



