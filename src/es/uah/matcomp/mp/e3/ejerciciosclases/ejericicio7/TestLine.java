package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient: " + l1.getGradient());

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Line line = new Line(p1, p2);
        System.out.println("Línea inicial: " + line);

        System.out.println("Punto de inicio: " + line.getBegin());
        System.out.println("Punto de fin: " + line.getEnd());

        line.setBegin(new Point(1, 1));
        line.setEnd(new Point(5, 5));
        System.out.println("Después de setBegin() y setEnd(): " + line);

        line.setBeginX(2);
        line.setBeginY(3);
        line.setBeginXY(4, 4);
        System.out.println("Después de modificar el punto de inicio: " + line);

        line.setEndX(6);
        line.setEndY(7);
        line.setEndXY(8, 9);
        System.out.println("Después de modificar el punto de fin: " + line);

        Point p3 = new Point(1, 2);
        Point p4 = new Point(4, 6);
        Line l2 = new Line(p3, p4);
        System.out.println(l2);
        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient: " + l2.getGradient());
    }
}

