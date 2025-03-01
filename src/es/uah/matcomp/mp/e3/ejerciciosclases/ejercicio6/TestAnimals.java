package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Tiburón");
        System.out.println(a);

        Mammal m = new Mammal("Ornitorrinco");
        System.out.println(m);

        Cat c = new Cat("Kira");
        System.out.println(c);
        c.greets();

        Dog d1 = new Dog("Lula");
        System.out.println(d1);
        d1.greets();

        Dog d2 = new Dog("Koke");
        d1.greets(d2);
    }
}
