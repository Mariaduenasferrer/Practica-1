package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    private Customer c = new Customer(36783, "Lucas", 'M');
    private Account a= new Account(1, c, 1000.0);
    @Test
    public void AccountTest() {
        assertEquals(1, a.getId());
        assertEquals(c, a.getCustomer());
        assertEquals(1000.0, a.getBalance());
    }
    @Test
    public void AccountTest2() {
        assertEquals(1, a.getId());
        assertEquals(c, a.getCustomer());
    }

    @Test
    void getId() {
        assertEquals(1, a.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c, a.getCustomer());
    }

    @Test
    void getBalance() {
        assertEquals(1000.0, a.getBalance());
    }

    @Test
    void setBalance() {
        a.setBalance(100.0);
        assertEquals(100.0, a.getBalance());
    }

    @Test
    void testToString() {
        assertEquals(c.toString() + " balance=" + String.format("%.2f", a.getBalance()), a.toString());

    }

    @Test
    void getCustomerName() {
        assertEquals("Lucas", c.getName());

    }
    @Test
    void testDeposit() {
        a.deposit(500.0);
        assertEquals(1500.0, a.getBalance(), 0.01);
    }
    @Test
    void testWithdraw() {
        a.withdraw(300.0);
        assertEquals(700.0, a.getBalance());
        a.withdraw(1200.0);
        assertEquals(700.0, a.getBalance());
    }
}


