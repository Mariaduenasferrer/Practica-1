package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4;

public class MovablePoint implements Movable {
        int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        public void resetPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(x=" + x + ",y=" + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
        }
    }

