package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {
    private Author a = new Author("pablo Rodriguez", "pablorodriguez@ejemplo.com");

    @Test
    void getName() {
        assertEquals("pablo Rodriguez", a.getName());

    }

    @Test
    void getEmail() {
        assertEquals("pablorodriguez@ejemplo.com", a.getEmail());

    }

    @Test
    void setEmail() {
        a.setEmail("pablorodriguez@ejemplo2.com");
        assertEquals("pablorodriguez@ejemplo2.com", a.getEmail());
    }

    @Test
    void testToString() {
        assertEquals("Author[name= " + a.getName() + " , email= " + a.getEmail() + "]", a.toString());
    }
}