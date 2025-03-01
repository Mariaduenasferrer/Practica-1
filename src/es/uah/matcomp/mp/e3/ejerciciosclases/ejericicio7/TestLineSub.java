package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(0, 0, 3, 4);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        Point p1 = new Point(0, 0);
                Point p2 = new Point(3, 4);

        LineSub line = new LineSub(p1, p2);

        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());

        Point newBegin = new Point(2, 2);
        Point newEnd = new Point(5, 6);
        line.setBegin(newBegin);
        line.setEnd(newEnd);
        System.out.println("Updated Begin: " + line.getBegin());
        System.out.println("Updated End: " + line.getEnd());

        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        line.setBeginX(10);
        line.setBeginY(15);
        line.setEndX(20);
        line.setEndY(25);
        System.out.println("After modifying coordinates:");
        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());

        line.setBeginXY(30, 35);
        line.setEndXY(40, 45);
        System.out.println("After setBeginXY and setEndXY:");
        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());


        System.out.println("Length of line: " + line.getLength());
        System.out.println("Gradient (in radians): " + line.getGradient());

        System.out.println("Line Description: " + line);
    }
}

