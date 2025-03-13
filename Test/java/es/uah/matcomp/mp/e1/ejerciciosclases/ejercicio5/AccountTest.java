package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AccountTest {
    private Account account1 = new Account("1", "Juan garcia");
    private Account account2 = new Account("2", "pedro Perez", 500);

    @Test
    void AccountTest() {
        assertEquals("1", account1.getId());
        assertEquals("Juan garcia", account1.getName());

        assertEquals("2", account2.getId());
        assertEquals("pedro Perez", account2.getName());
        assertEquals(500, account2.getBalance());
    }
    @Test
    void getId() {
        assertEquals("1", account1.getId());
        assertEquals("2", account2.getId());

    }

    @Test
    void getName() {
        assertEquals("Juan garcia", account1.getName());
        assertEquals("pedro Perez", account2.getName());

    }

    @Test
    void getBalance() {
        assertEquals(500, account2.getBalance());
    }

    @Test
    void credit() {
        int newBalance = account2.credit(500);
        assertEquals(1000, newBalance);
    }

    @Test
    void debit() {
        int newBalance = account2.debit(300);
        assertEquals(200, newBalance);
    }

    @Test
    void transferTo() {
        int newBalance = account2.debit(300);

        assertEquals(0, newBalance);
    }

    @Test
    void testToString() {
        assertEquals("Account [id=" + account1.getId() + ", name=" + account1.getName() + ", balance=" + account1.getBalance() + "]", account1.toString());
        assertEquals("Account [id=" + account2.getId() + ", name=" + account2.getName() + ", balance=" + account2.getBalance() + "]", account2.toString());

    }

}