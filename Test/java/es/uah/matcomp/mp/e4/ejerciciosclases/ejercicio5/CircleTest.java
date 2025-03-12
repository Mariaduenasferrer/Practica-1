package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle = new Circle(5.0); // Inicializa un círculo con un radio de 5.0

    @Test
    void testToString() {
        String expected = "Circle[radius=5.0]";
        assertEquals(expected, circle.toString());
    }

    @Test
    void getPerimeter() {
        double expectedPerimeter = 2 * Math.PI * 5.0; // Perímetro = 2 * π * radio
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.001); // Tolerancia para comparación
    }

    @Test
    void getArea() {
        double expectedArea = Math.PI * Math.pow(5.0, 2); // Área = π * radio^2
        assertEquals(expectedArea, circle.getArea(), 0.001); // Tolerancia para comparación
    }
}