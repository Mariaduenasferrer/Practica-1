package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio3;

public class TestPoints {
    public static void main(String[] args) {
        // Crear un objeto de Points2D
        Points2D point2D = new Points2D(3.0f, 4.0f);
        System.out.println("Point2D: " + point2D); // Llama a toString()

        // Actualizar las coordenadas de point2D
        point2D.setXY(5.0f, 6.0f);
        System.out.println("Updated Point2D: " + point2D);

        // Crear un objeto de Points3D
        Points3D point3D = new Points3D(7.0f, 8.0f, 9.0f);
        System.out.println("Point3D: " + point3D); // Llama a toString()

        // Actualizar las coordenadas de point3D
        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("Updated Point3D: " + point3D);

        // Obtener los valores XY y XYZ de los puntos
        float[] xy = point2D.getXY();
        System.out.println("Coordinates of Point2D: (" + xy[0] + ", " + xy[1] + ")");

        float[] xyz = point3D.getXYZ();
        System.out.println("Coordinates of Point3D: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}


