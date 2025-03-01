package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio6;

public class BigDog extends Dog {
    public BigDog(String n) {
        super(n);
    }
    @Override
    public void greets() {
        System.out.println("Woooow");
    }
    @Override
    public void greets(Dog another) {
        System.out.println("Wooooooow");
    }
    public void greets( BigDog another) {
        System.out.println("Wooooooooooow");
    }
}



