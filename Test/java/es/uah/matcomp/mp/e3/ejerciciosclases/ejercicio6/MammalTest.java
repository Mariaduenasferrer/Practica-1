package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    private Mammal mammal = new Mammal("perro");
    @Test
    void testToString() {assertEquals("Mammal[Animal[name=perro]]", mammal.toString());
    }
}