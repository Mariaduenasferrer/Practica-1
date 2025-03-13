package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Cylinder2Test {

    @Test
    void testDefaultConstructor() {
        Cylinder2 cylinder = new Cylinder2();

        assertEquals(1.0, cylinder.getHeight());
        assertNotNull(cylinder.getBase());
        assertEquals(1.0, cylinder.getBase().getRadius());
    }

    @Test
    void testParameterizedConstructor() {
        Cylinder2 cylinder = new Cylinder2(2.0, 5.0, "blue");

        assertEquals(5.0, cylinder.getHeight());
        assertEquals(2.0, cylinder.getBase().getRadius());
    }

    @Test
    void testSetHeight() {
        Cylinder2 cylinder = new Cylinder2();
        cylinder.setHeight(10.0);

        assertEquals(10.0, cylinder.getHeight());
    }

    @Test
    void testSetBase() {
        Cylinder2 cylinder = new Cylinder2();
        Circle2 newBase = new Circle2(3.0, "green");
        cylinder.setBase(newBase);

        assertEquals(3.0, cylinder.getBase().getRadius());
    }

    @Test
    void testGetVolume() {
        Cylinder2 cylinder = new Cylinder2(3.0, 4.0, "yellow");

        // Volumen = π * radio² * altura
        assertEquals(Math.PI * 3.0 * 3.0 * 4.0, cylinder.getVolume(), 0.0001);
    }

    @Test
    void testToString() {
        Cylinder2 cylinder = new Cylinder2(2.0, 5.0, "blue");
        String expected = "Cylinder[base=Circle[radius=2.0, color=blue], height=5.0]";

        assertEquals(expected, cylinder.toString());
    }
}
