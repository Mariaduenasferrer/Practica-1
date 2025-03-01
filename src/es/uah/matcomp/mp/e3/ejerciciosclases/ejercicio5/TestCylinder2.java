package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio5;

public class TestCylinder2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(5.0);
        System.out.println(c1);

        Cylinder2 cy1 = new Cylinder2(5.0, 10.0);
        System.out.println(cy1);
        System.out.println("Volumen: " + cy1.getVolume());
    }
}
