package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio3;

public class Points3D extends Points2D{
    // Clase interna Point3D que hereda de Point2D


        // Varaible extra
        private float z;

        // Constructores
        public Points3D() {
            super();
            this.z = 0.0f;
        }

        public Points3D(float x, float y, float z) {
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

