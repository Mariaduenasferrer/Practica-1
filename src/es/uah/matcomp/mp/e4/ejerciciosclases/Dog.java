package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Dog extends Animal2 {
    public Dog(String name) {
        super(name);

    }
    @Override
    public void greets() {
        System.out.println("Woof");

    }

    public void greets(Dog another){
        System.out.println("Wooooof");


    }

}
