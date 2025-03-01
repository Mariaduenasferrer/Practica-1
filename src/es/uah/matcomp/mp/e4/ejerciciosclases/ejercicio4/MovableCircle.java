package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4;

public class MovableCircle implements Movable {
        private int radius;
        private MovablePoint center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        @Override
        public void moveUp() {
            center.moveUp();
        }

        @Override
        public void moveDown() {
            center.moveDown();
        }

        @Override
        public void moveLeft() {
            center.moveLeft();
        }

        @Override
        public void moveRight() {
            center.moveRight();
        }

        public void resetPosition(int x, int y) {
            center.resetPosition(x, y);
        }

        @Override
        public String toString() {
            return "(x=" + center.x + ",y=" + center.y + "),speed=(" + center.xSpeed + "," + center.ySpeed + "),radius=" + radius;
        }
    }

