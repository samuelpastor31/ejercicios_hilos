package Ejercicio1;

import Ejercicio3.ThreadHorse;

public class App {
    public static void main(String[] args) {
        Thread[] horses = new Thread[11];
        String nombreCaballo;

        // Runnable
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                nombreCaballo = "Caballo10";
            } else {
                nombreCaballo = "Caballo0" + i;
            }
            horses[i] = new Thread(new ThreadHorse(nombreCaballo));
            horses[i].start();
        }
    }
}
