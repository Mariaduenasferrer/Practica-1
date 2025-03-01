package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio3;

import es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4.Movable;

public class MovablePoint implements Movable {

        // Variables
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        // Constructor
        MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Movimientos
        @Override
        public void moveUp() {
            this.y -= ySpeed;
        }

        @Override
        public void moveDown() {
            this.y += ySpeed;
        }

        @Override
        public void moveLeft() {
            this.x -= xSpeed;
        }

        @Override
        public void moveRight() {
            this.x += xSpeed;
        }
        public void resetPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Salida
        @Override
        public String toString() {
            return "(" + x + "," + y + " Speed = " + xSpeed + "," + ySpeed + ")";
        }
    }

