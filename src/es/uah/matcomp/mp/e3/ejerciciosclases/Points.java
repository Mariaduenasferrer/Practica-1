package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Points {

    // Clase interna Point2D
    public static class Point2D {

        // Variables
        private float x;
        private float y;

        // Constructores
        public Point2D() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public Point2D(float x, float y) {
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

        public float[] getXY() {
            return new float[] { x, y };
        }

        // Setter
        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
        // Procedimiento
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    // Clase interna Point3D que hereda de Point2D
    public static class Point3D extends Point2D {

        // Varaible extra
        private float z;

        // Constructores
        public Point3D() {
            super();
            this.z = 0.0f;
        }

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        // Getter
        public float getZ() {
            return z;
        }

        public float[] getXYZ() {
            return new float[] { getX(), getY(), z };
        }

        // Setter
        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z) {
            setXY(x, y); // Llama a los setters de la superclase
            this.z = z;
        }

        // Procedimiento
        @Override
        public String toString() {
            return "(" + getX() + ", " + getY() + ", " + z + ")";
        }
    }
}

