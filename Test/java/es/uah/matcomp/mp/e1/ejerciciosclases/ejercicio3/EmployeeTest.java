package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void EmployeeTest1() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals(1, e.getId());
        assertEquals("Juan", e.getFirstName());
        assertEquals("Fernandez", e.getLastName());
        assertEquals(12345, e.getSalary());

    }

    @Test
    void getId() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals(1, e.getId());
    }

    @Test
    void getFirstName() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals("Juan", e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals("Fernandez", e.getLastName());
    }

    @Test
    void getName() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals(e.getFirstName()+ " " + e.getLastName(), e.getName());
    }

    @Test
    void getSalary() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals(12345, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        e.setSalary(12345678);
        assertEquals(12345678, e.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals(12345*12, e.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e= new Employee(1, "Juan", "Fernandez", 400);
        int newSalary = e.raiseSalary(10);
        assertEquals(440, newSalary);    }

    @Test
    void testToString() {
        Employee e= new Employee(1, "Juan", "Fernandez", 12345);
        assertEquals("Employee[id = " + e.getId()+ ", name= " + e.getName()+ ", salary=" + e.getSalary()+ " ]", e.toString());
    }
}