package Ejercicio5;

public class Carrera {

    public static void main(String[] args) {
            Animal tortuga1 = new Animal(3000,100,100,"Tortuga");
            Animal tortuga2 = new Animal(3000,100,100,"Tortuga");
            Animal tortuga3 = new Animal(3000,100,100,"Tortuga");
            Animal tortuga4 = new Animal(3000,100,100,"Tortuga");

            Animal conejo1 = new Animal(3000,100,100,"Conejo");
            Animal conejo2 = new Animal(3000,100,100,"Conejo");
            Animal conejo3 = new Animal(3000,100,100,"Conejo");

            Animal guepardo = new Animal(3000,100,100,"Guepardo");

            // Crear hilos para cada animal
            Thread threadTortuga1 = new Thread(tortuga1);
            Thread threadTortuga2 = new Thread(tortuga2);
            Thread threadTortuga3 = new Thread(tortuga3);
            Thread threadTortuga4 = new Thread(tortuga4);

            Thread threadConejo1 = new Thread(conejo1);
            Thread threadConejo2 = new Thread(conejo2);
            Thread threadConejo3 = new Thread(conejo3);

            Thread threadGuepardo = new Thread(guepardo);

            threadTortuga1.start();
            threadTortuga2.start();
            threadTortuga3.start();
            threadTortuga4.start();

            threadConejo1.start();
            threadConejo2.start();
            threadConejo3.start();

            threadGuepardo.start();
    }
}
