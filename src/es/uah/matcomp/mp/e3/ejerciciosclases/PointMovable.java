package es.uah.matcomp.mp.e3.ejerciciosclases;

public class PointMovable extends PointM {

        // Variables
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        // Constructores
        public PointMovable() {}

        public PointMovable(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public PointMovable(float xSpeed, float ySpeed) {
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
            super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
            return this;
        }
    }

