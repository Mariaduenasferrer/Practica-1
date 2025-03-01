package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

public class Cat extends Mammal {
    public Cat(String n) {
        super(n);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
