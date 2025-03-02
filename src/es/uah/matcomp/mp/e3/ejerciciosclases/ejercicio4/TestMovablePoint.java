package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio4;

public class TestMovablePoint {
    public static void main(String[] args) {
        // Crear un punto móvil
        MovablePoint point = new MovablePoint(2.5f, 3.5f, 0.0f, 0.0f);
        System.out.println("Point: " + point);

        // Cambiar las coordenadas del punto
        point.setXY(4.5f, 5.5f);
        System.out.println("Updated Point: " + point);

        // Crear otro punto móvil con velocidad
        MovablePoint movable = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
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



