package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    private ResizableCircle resizableCircle = new ResizableCircle(10.0);

    @Test
    void testToString() {
        String expected = "ResizableCircle[Circle[radius=10.0]]";
        assertEquals(expected, resizableCircle.toString());
    }

    @Test
    void resize() {
        resizableCircle.resize(-50);
        assertEquals(5.0, resizableCircle.radius);
    }
}