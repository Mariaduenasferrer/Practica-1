package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {
    public Customer c = new Customer(1, "Pedro", 10);
    public Invoice i = new Invoice(1, c, 200);

    @Test
    void test() {
        assertEquals(1,i.getId());
        assertEquals(200, i.getAmount());
        assertEquals(c ,i.getCustomer());
    }


    @Test
    void getId() {
        assertEquals(1, i.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c,i.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer newCustomer = new Customer(2, "Juan", 15);
        i.setCustomer(newCustomer);
        assertEquals(newCustomer, i.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(200,i.getAmount());
    }

    @Test
    void setAmount() {
        i.setAmount(250);
        assertEquals(250, i.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(1,i.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("Pedro",i.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(10,i.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(180,i.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        String expectedString = "Invoice[id=1,customer=Pedro(1)(10%),amount=200.0]";
        assertEquals(expectedString, i.toString());
    }
}