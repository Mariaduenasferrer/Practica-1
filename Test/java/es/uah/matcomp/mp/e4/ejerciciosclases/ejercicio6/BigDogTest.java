package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

class BigDogTest {

    @Test
    void greets() {
        BigDog bigDog = new BigDog("Perro1");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bigDog.greets();

        assertEquals("Woooow", outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testGreets() {
        BigDog bigDog = new BigDog("Perro1");
        Dog dog = new Dog("Perro2");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        bigDog.greets(dog);

        assertEquals("Woooooow", outContent.toString().trim());

        System.setOut(originalOut);
    }

    @Test
    void testGreets1() {
        BigDog bigDog1 = new BigDog("Perro1");
        BigDog bigDog2 = new BigDog("Perro3");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        bigDog1.greets(bigDog2);

        assertEquals("Wooooooooow", outContent.toString().trim());

        System.setOut(originalOut);
    }
}