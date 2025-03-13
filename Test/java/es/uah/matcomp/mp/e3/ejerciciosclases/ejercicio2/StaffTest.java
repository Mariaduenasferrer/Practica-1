package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    private Staff staff = new Staff("John Doe", "123 Main St", "Engineering", 30000.0);
    @Test
    void getSchool() {assertEquals("Engineering", staff.getSchool());}

    @Test
    void setSchool() {
        staff.setSchool("Computer Science");
        assertEquals("Computer Science", staff.getSchool());
    }

    @Test
    void getPay() {assertEquals(30000.0, staff.getPay());}

    @Test
    void setPay() {
        staff.setPay(20000.0);
        assertEquals(20000.0, staff.getPay());
    }

    @Test
    void testToString() {
        assertEquals("Staff[Person[name=John Doe,address=123 Main St],school=Engineering,pay=30000.0]", staff.toString());
    }
}