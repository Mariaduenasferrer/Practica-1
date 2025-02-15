package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TestPoints {
    public static void main(String[] args) {
        // Crear una instancia de Point2D
        Points.Point2D point2D = new Points.Point2D(3.0f, 4.0f);
        System.out.println("Point2D: " + point2D);
        point2D.setXY(5.0f, 6.0f);
        System.out.println("Updated Point2D: " + point2D);

        // Crear una instancia de Point3D
        Points.Point3D point3D = new Points.Point3D(7.0f, 8.0f, 9.0f);
        System.out.println("Point3D: " + point3D);
        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("Updated Point3D: " + point3D);

        // Obtener coordenadas XY y XYZ
        float[] xy = point2D.getXY();
        System.out.println("Coordinates of Point2D: (" + xy[0] + ", " + xy[1] + ")");
        float[] xyz = point3D.getXYZ();
        System.out.println("Coordinates of Point3D: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}
