package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {
    private Time t = new Time(17, 45, 56);

    @Test
    void getHour() {
        assertEquals(17, t.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(45, t.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(56, t.getSecond());
    }


    @Test
    void setHour() {
        t.setHour(3);
        assertEquals(3, t.getHour());
    }

    @Test
    void setMinute() {
        t.setMinute(3);
        assertEquals(3, t.getMinute());
    }

    @Test
    void setSecond() {
        t.setSecond(3);
        assertEquals(3, t.getSecond());
    }

    @Test
    void setTime() {
        t.setTime(1, 23, 34);
        assertEquals(1, t.getHour());
        assertEquals(23, t.getMinute());
        assertEquals(34, t.getSecond());
    }

    @Test
    void testToString() {
        assertEquals(String.format("%02d:%02d:%02d", t.getHour(), t.getMinute(), t.getSecond()), t.ToString());
    }

    @Test
    void nextSecond() {
        t.setTime(10, 15, 30);
        t.nextSecond();
        assertEquals("10:15:31", t.toString());
    }

    @Test
    void previousSecond() {
        t.setTime(10, 15, 30);
        t.previousSecond();
        assertEquals("10:15:29", t.toString());
    }
}