package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio5;

public class Account {
    private String id;
    private String name;
    private int balance = 0;


    public Account(String i, String n) {
        id = i;
        name = n;
    }


    public Account(String i, String n, int b) {
        id = i;
        name = n;
        balance = b ;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public int getBalance() {
        return balance;

    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }


    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }


    public String toString() {
        return "Account [id=" + this.getId() + ", name=" + this.getName() + ", balance=" + this.getBalance() + "]";

    }

}



