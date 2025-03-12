package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceItemTest {

    @Test
    void InvoiceItemTest() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals("1", i.getId());
        assertEquals("ordenador", i.getDesc());
        assertEquals(2, i.getQty());
        assertEquals(500, i.getUnitPrice());
    }
    @Test
    void getId() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals("1", i.getId());

    }

    @Test
    void getDesc() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals("ordenador", i.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals(2, i.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        i.setQty(2);
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals(500, i.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        i.setUnitPrice(3);
        assertEquals(3, i.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals(500*2, i.getTotal());

    }

    @Test
    void testToString() {
        InvoiceItem i= new InvoiceItem("1", "ordenador", 2, 500);
        assertEquals("InvoiceItem [id = " + i.getId()+ ", desc= " + i.getDesc()+ ", qty=" + i.getQty()+ ", unitPrice= " + i.getUnitPrice()+ " ]", i.toString());
    }
}