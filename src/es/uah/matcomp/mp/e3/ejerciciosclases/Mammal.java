package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Mammal extends Animal {
    public Mammal(String n) {
        super(n);
    }
    @Override
    public String toString() {
        return "Mammal["+super.toString()+"]";
    }
}
