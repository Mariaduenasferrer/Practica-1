package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student = new Student("Jane Doe", "456 College Ave", "Computer Science", 2, 15000.0);
    @Test
    void getProgram() {assertEquals("Computer Science", student.getProgram());}

    @Test
    void getYear() {assertEquals(2, student.getYear());}

    @Test
    void getFee() {assertEquals(15000.0, student.getFee());}

    @Test
    void setProgram() {
        student.setProgram("Engineering");
        assertEquals("Engineering", student.getProgram());
    }

    @Test
    void setYear() {
        student.setYear(5);
        assertEquals(5, student.getYear());
    }

    @Test
    void setFee() {
        student.setFee(20000.0);
        assertEquals(20000.0, student.getFee());
    }

    @Test
    void testToString() {assertEquals("Student[Person[name=Jane Doe,address=456 College Ave],program=Computer Science,year=2,fee=15000.0]", student.toString());
    }
}