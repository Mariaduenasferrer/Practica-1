package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio1;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty =0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {

        return isbn;
    }

    public String getName() {

        return name;
    }

    public Author getAuthor() {

        return author;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double newPrice) {

        price = newPrice;
    }

    public int getQty() {

        return qty;
    }

    public void setQty(int newQty) {

        qty = newQty;
    }
    public String getAuthorName() {

        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn=" + this.getIsbn()+",name=" + this.getName() + "," + this.author.toString() + ",price=" + this.getPrice() + ",qty=" + this.getQty() + "]";
    }
}

