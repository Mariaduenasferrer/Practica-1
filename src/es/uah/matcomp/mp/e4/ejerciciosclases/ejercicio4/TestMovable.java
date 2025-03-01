package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4;

public class TestMovable {
    public static void main(String[] args) {

        //  Movimientos de Point
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("MovablePoint inicial: " + point);

        // Movimeinto arriba
        point.moveUp();
        System.out.println("Después de moveUp: " + point);

        // Movimiento abajo
        point.resetPosition(0, 0);
        point.moveDown();
        System.out.println("Después de moveDown desde la posición inicial: " + point);

        // Movimiento derecha
        point.resetPosition(0, 0);
        point.moveRight();
        System.out.println("Después de moveRight desde la posición inicial: " + point);

        // Movimiento izquierda
        point.resetPosition(0, 0);
        point.moveLeft();
        System.out.println("Después de moveLeft desde la posición inicial: " + point);

        // Movimientos de Circle
        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 10);
        System.out.println("MovableCircle inicial: " + circle);

        // Movimiento arriba
        circle.moveUp();
        System.out.println("Después de moveUp: " + circle);

        // Movimiento abajo
        circle.resetPosition(0, 0);
        circle.moveDown();
        System.out.println("Después de moveDown desde la posición inicial: " + circle);

        // Movimiento derecha
        circle.resetPosition(0, 0);
        circle.moveRight();
        System.out.println("Después de moveRight desde la posición inicial: " + circle);

        // Movimiento izquierda
        circle.resetPosition(0, 0);
        circle.moveLeft();
        System.out.println("Después de moveLeft desde la posición inicial: " + circle);
    }
}
