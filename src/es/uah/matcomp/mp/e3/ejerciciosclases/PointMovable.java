package es.uah.matcomp.mp.e3.ejerciciosclases;

public class PointMovable {

    public static class Point {

        // Variables
        private float x = 0.0f;
        private float y = 0.0f;

        // Constructores
        public Point() {}

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        // Getter
        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        // Setter
        public void setX(float x) {
            this.x = x;
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY() {
            return new float[] {x, y};
        }

        // Procedimiento
        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    public static class Movable extends Point {

        // Variables
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        // Constructores
        public Movable() {}

        public Movable(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public Movable(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Getter
        public float getXSpeed() {
            return xSpeed;
        }

        public float getYSpeed() {
            return ySpeed;
        }

        public float[] getSpeed() {
            return new float[] {xSpeed, ySpeed};
        }

        // Setter
        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Procedimiento
        @Override
        public String toString() {
            return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
        }

        public Movable move() {
            setXY(getX() + xSpeed, getY() + ySpeed);
            return this;
        }
    }
}



