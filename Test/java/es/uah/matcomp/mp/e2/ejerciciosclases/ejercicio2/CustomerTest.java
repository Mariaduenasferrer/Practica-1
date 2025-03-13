package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    private Customer c= new Customer(1, "yuio qweer", 10);

    @Test
    public void test() {
        assertEquals("yuio qweer",c.getName());
        assertEquals(1, c.getId());
        assertEquals(10,c.getDiscount());
    }

    @Test
    void getId() {
        assertEquals(1,c.getId());
    }

    @Test
    void getName() {
        assertEquals("yuio qweer",c.getName());
    }

    @Test
    void getDiscount() {
        assertEquals(10,c.getDiscount());
    }

    @Test
    void setDiscount() {
        c.setDiscount(15);
        assertEquals(15, c.getDiscount());

    }

    @Test
    void testToString() {
        assertEquals(c.getName() +"("+ c.getId()+")(" + c.getDiscount()+"%)", c.toString());
    }
}