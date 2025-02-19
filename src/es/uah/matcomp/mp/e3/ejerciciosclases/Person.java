package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Person {
    private String name;
    private String address;

    public Person(String n, String a) {
        address = a;
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String toString() {
        return "Person[name=" + name + ", address=" + address +"]";
    }
}

