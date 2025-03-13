package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTest {
    private Date d= new Date(4, 4, 2004);

    @Test
    void getDate() {
        assertEquals(4, d.getDay());
        assertEquals(4, d.getMonth());
        assertEquals(2004, d.getYear());
    }

    @Test
    void getDay() {
        assertEquals(4, d.getDay());
    }

    @Test
    void getMonth() {
        assertEquals(4, d.getMonth());
    }

    @Test
    void getYear() {
        assertEquals(2004, d.getYear());
    }

    @Test
    void setDay() {
        d.setDate(10, 8, 2029);
        assertEquals(10, d.getDay());
        assertEquals(8, d.getMonth());
        assertEquals(2029, d.getYear());
        d.setDay(4);
        assertEquals(4,d.getDay());
    }

    @Test
    void setMonth() {
        d.setMonth(5);
        assertEquals(5, d.getMonth());
    }

    @Test
    void setYear() {
        d.setYear(2004);
        assertEquals(2004, d.getYear());
    }

    @Test
    void setDate() {
        d.setDate(10, 8, 2029);
        assertEquals(10, d.getDay());
        assertEquals(8, d.getMonth());
        assertEquals(2029, d.getYear());
    }

    @Test
    void testToString() {
        assertEquals(String.format("%02d/%02d/%04d", d.getDay(), d.getMonth(), d.getYear()), d.toString());
    }
}