package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio4;

class MovablePoint extends PointM {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }
    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() { return new float[]{xSpeed, ySpeed}; }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }


    public MovablePoint move() {
        setXY(super.getX() + xSpeed, super.getY() + ySpeed);
        return this;
    }


}
