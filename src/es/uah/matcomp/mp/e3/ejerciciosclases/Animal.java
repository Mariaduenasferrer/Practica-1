package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Animal {
    protected String name;

    public Animal(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
