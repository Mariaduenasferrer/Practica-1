package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

public class Mammal extends Animal {
    public Mammal(String n) {
        super(n);
    }
    @Override
    public String toString() {
        return "Mammal["+super.toString()+"]";
    }
}
