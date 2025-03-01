package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

public class Dog extends Mammal {
    public Dog(String n) {
        super(n);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dos[" + super.toString() + "]";
    }
}
