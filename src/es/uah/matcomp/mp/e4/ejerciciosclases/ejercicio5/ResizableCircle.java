package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double r) {
        super(r);
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
