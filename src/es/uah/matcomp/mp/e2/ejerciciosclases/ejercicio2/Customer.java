package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio2;


public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int newDiscount) {
        this.discount = newDiscount;
    }
    public String toString() {
        return this.getName() +"("+ this.getId()+")(" + this.getDiscount()+"%)";
    }
}


