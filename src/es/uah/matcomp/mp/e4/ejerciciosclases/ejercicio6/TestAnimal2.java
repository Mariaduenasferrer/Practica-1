package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio6;

public class TestAnimal2 {
    public static void main(String[] args) {
            // Usando subclases
            Cat cat1 = new Cat("rhgd");
            cat1.greets();

            Dog dog1 = new Dog("rgf");
            dog1.greets();

            BigDog bigDog1 = new BigDog("gghtd");
            bigDog1.greets();

            // Usando polimorfismo
            Animal2 animal1 = new Cat("gsrdvd");
            animal1.greets();

            Animal2 animal2 = new Dog("gbff");
            animal2.greets();

            Animal2 animal3 = new BigDog("gdfgd");
            animal3.greets();

             // Downcasting
            Dog dog2 = (Dog) animal2;
            BigDog bigDog2 = (BigDog) animal3;
            Dog dog3 = (Dog) animal3;

            dog2.greets(dog3);// woooooof
            dog3.greets(dog2); // wooooooow
            dog2.greets(bigDog2); //wooooof
            bigDog2.greets(dog2);//woooooow
            bigDog2.greets(bigDog1); //woooooooooooow


    }
}


