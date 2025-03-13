package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal = new Animal("Toby");
    @Test
    void testToString() {assertEquals("Animal[name=Toby]",animal.toString());
    }
}