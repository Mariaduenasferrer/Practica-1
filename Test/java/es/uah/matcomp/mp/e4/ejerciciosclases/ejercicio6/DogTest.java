package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Perro1");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        assertEquals("Woof", outContent.toString().trim());

        System.setOut(System.out);
    }


    @Test
    void testGreets() {
        Dog dog1 = new Dog("Perro1");
        Dog dog2 = new Dog("Perro2");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog1.greets(dog2);

        assertEquals("Wooooof", outContent.toString().trim());

        System.setOut(System.out);
    }
}