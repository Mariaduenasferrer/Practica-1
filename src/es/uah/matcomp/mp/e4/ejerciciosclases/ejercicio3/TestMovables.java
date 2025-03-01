package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio3;

public class TestMovables {
     public static void main(String[] args) {

         // Crear un objeto MovablePoint
         MovablePoint point = new MovablePoint(5, 1, 6, 3);

         // Mostrar las coordenadas iniciales
         System.out.println(point.toString());

         // Mover hacia arriba
         point.moveUp();
         System.out.println("El movimiento moveUp es: " + point.toString());

         // Mover hacia abajo
         point.resetPosition(5, 1);
         point.moveDown();
         System.out.println("El movimiento moveDown es: " + point.toString());

         // Mover hacia la izquierda
         point.resetPosition(5, 1);
         point.moveLeft();
         System.out.println("El movimiento moveLeft es: " + point.toString());

         // Mover hacia la derecha
         point.resetPosition(5, 1);
         point.moveRight();
         System.out.println("El movimiento moveRight es: " + point.toString());
     }
 }


