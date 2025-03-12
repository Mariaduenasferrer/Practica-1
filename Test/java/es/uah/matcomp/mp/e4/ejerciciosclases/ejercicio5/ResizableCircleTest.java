package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    private ResizableCircle resizableCircle = new ResizableCircle(10.0); // Inicializa un círculo redimensionable con un radio de 10.0

    @Test
    void testToString() {
        String expected = "ResizableCircle with radius: 10.0";
        assertEquals(expected, resizableCircle.toString());
    }

    @Test
    void resize() {
        resizableCircle.resize(50); // Aumenta el radio en un 50%
        assertEquals(15.0, resizableCircle.getRadius(), 0.001); // Nuevo radio esperado: 10.0 * 1.5

        resizableCircle.resize(-50); // Disminuye el radio en un 50%
        assertEquals(5.0, resizableCircle.getRadius(), 0.001); // Nuevo radio esperado: 10.0 * 0.5

        resizableCircle.resize(0); // No cambia el radio
        assertEquals(10.0, resizableCircle.getRadius(), 0.001); // El radio debería seguir siendo 10.0
    }
}