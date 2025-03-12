package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    private Author a= new Author("karen García", "karengarcia@ejemplo.com");
    private Book b= new Book("1234", "lo tuyo", a, 15.99, 56);


    @Test
    void getIsbn() {
        assertEquals("1234", b.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("lo tuyo", b.getName());
    }

    @Test
    void getAuthor() {
        assertEquals(a, b.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(15.99, b.getPrice());
    }

    @Test
    void setPrice() {
        b.setPrice(34.99);
        assertEquals(34.99, b.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(56, b.getQty());
    }

    @Test
    void setQty() {
        b.setQty(234);
        assertEquals(234, b.getQty());
    }

    @Test
    void getAuthorName() {
        assertEquals("karen García", b.getAuthorName());
    }

    @Test
    void testToString() {
        assertEquals( "Book[isbn=" + b.getIsbn()+",name=" + b.getName() + "," + a.toString() + ",price=" + b.getPrice() + ",qty=" + b.getQty() + "]", b.toString());
    }
}