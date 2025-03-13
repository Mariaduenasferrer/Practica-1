package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    private Customer c = new Customer(36783, "Lucas", 'M');

    @Test
    void getId() {
        assertEquals(36783, c.getId());
    }

    @Test
    void getName() {
        assertEquals("Lucas", c.getName());
    }

    @Test
    void getGender() {
        assertEquals('M', c.getGender());
    }

    @Test
    void testToString() {
        assertEquals(c.getName()+"("+ c.getId()+")", c.toString());
    }
}