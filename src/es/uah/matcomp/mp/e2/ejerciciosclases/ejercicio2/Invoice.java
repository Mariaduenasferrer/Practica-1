package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio2;


public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice (int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer newCcustomer) {
        this.customer = newCcustomer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return  amount - (amount * customer.getDiscount() / 100.0);
    }
    public String toString() {
        return "Invoice[id=" + this.getId() + ",customer=" + getCustomer().toString() + ",amount=" + this.getAmount() + "]";
    }
}


