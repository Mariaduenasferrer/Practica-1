package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestShapeTest {

    @Test
    void main() {
    }
    @Test
    void testCircle() {
        Circle circle = new Circle(5.0, "blue", true);
        assertEquals(5.0, circle.getRadius());
        assertEquals(Math.PI * 5.0 * 5.0, circle.getArea(), 0.01);
        assertEquals("Circle[Shape{color=blue, filled=true}, radius=5.0]", circle.toString());
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, "green", true);
        assertEquals(4.0, rectangle.getWidth());
        assertEquals(5.0, rectangle.getLength());
        assertEquals(4.0 * 5.0, rectangle.getArea(), 0.01);
        assertEquals("Rectangle[Shape{color=green, filled=true}, width=4.0 length=5.0]", rectangle.toString());
    }

    @Test
    void testSquare() {
        Square square = new Square(3.0, "yellow", true);
        assertEquals(3.0, square.getSide());
        assertEquals(3.0 * 3.0, square.getArea(), 0.01);
        assertEquals("Square[Rectangle[Shape{color=yellow, filled=true}, width=3.0 length=3.0], side=3.0]", square.toString());
    }
}