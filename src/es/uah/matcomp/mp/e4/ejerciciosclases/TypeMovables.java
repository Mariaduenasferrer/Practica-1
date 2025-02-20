package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TypeMovables {
    // Interfaz Movable
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Clase MovablePoint
    public static class MovablePoint implements Movable {
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

    // Clase MovableCircle
    public static class MovableCircle implements Movable {
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
}



