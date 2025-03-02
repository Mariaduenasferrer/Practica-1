package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio4;

public class PointM {

    // Variables
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructores
    public PointM() {}

    public PointM(float x, float y) {
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