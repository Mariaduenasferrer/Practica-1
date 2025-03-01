package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio5;


public class TestMyLine {
    public static void main(String[] args) {
        // dos puntos
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // línea con los puntos anteriores
        MyLine line = new MyLine(p1, p2);
        System.out.println( line); // toString()

        //  get y set
        System.out.println("Punto inicial: " + line.getBegin());
        System.out.println("Punto final: " + line.getEnd());

        line.setBegin(new MyPoint(2, 3));
        line.setEnd(new MyPoint(5, 7));

        System.out.println( line);

        //  get coordenadas
        System.out.println("Inicio X: " + line.getBeginX());
        System.out.println("Inicio Y: " + line.getBeginY());
        System.out.println("Fin X: " + line.getEndX());
        System.out.println("Fin Y: " + line.getEndY());

        //  set coordenadas
        line.setBeginX(3);
        line.setBeginY(4);
        line.setEndX(6);
        line.setEndY(8);
        System.out.println(line);

        // getXY y setXY
        System.out.println("Coordenadas iniciales (begin): " +
                "(" + line.getBeginXY()[0] + ", " + line.getBeginXY()[1] + ")");
        System.out.println("Coordenadas finales (end): " +
                "(" + line.getEndXY()[0] + ", " + line.getEndXY()[1] + ")");

        // setBeginXY y setEndXY
        line.setBeginXY(2, 3);
        line.setEndXY(5, 7);
        System.out.println("coordenadas (begin): " +
                "(" + line.getBeginXY()[0] + ", " + line.getBeginXY()[1] + ")");
        System.out.println("coordenadas (end): " +
                "(" + line.getEndXY()[0] + ", " + line.getEndXY()[1] + ")");

        // longitud y pendiente
        System.out.println("Longitud : " + line.getLength());
        System.out.println("Pendiente : " + line.getGradient());


    }
}
