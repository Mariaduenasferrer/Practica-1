package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person = new Person("John Doe", "123 Main St");

    @Test
    void getName() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    void getAddress() {
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    void setAddress() {
        person.setAddress("456 Park Ave");
        assertEquals("456 Park Ave", person.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Person[name=John Doe,address=123 Main St]", person.toString());
    }
}