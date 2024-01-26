package Ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;

        while (true) {
            System.out.print("Ingrese un número par N: ");
            N = scanner.nextInt()/2;

            if (N % 2 == 0 && N > 0 ) {
                break; // Salir del bucle si el número es par
            } else {
                System.out.println("Por favor, ingrese un número par que sea mayor a 0");
            }
        }

        for (int i = 1; i <= N ; i++) {
            if (i % 2!= 0) {
                int numeroEntrenador = i+1;
                Thread entrenador = new Thread(new TrainerThread("Soy el Entrenador número "+ numeroEntrenador));
                Thread pokemon = new Thread(new PokemonThread("Soy el Pokémon número "+ i,entrenador ));

                pokemon.start();
                entrenador.start();
            }
        }
    }
}
