package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square = new Square(4.0, "blue", true);

    @Test
    void getSide() {
        assertEquals(4.0, square.getSide());
    }

    @Test
    void setSide() {
        square.setSide(5.0);
        assertEquals(5.0, square.getSide());
    }

    @Test
    void setWidth() {
        square.setWidth(6.0);
        assertEquals(6.0, square.getSide());
    }

    @Test
    void setLength() {
        square.setLength(7.0);
        assertEquals(7.0, square.getSide());
    }

    @Test
    void testToString() {
        String expected = "Square[Rectangle[Shape{color=blue, filled=true}, width=4.0 length=4.0], side=4.0]";
        assertEquals(expected, square.toString());
    }
}