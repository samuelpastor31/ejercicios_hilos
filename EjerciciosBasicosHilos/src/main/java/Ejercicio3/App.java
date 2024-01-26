package Ejercicio3;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Thread[] horses = new Thread[11];
        String nombreCaballo;

        // Runnable
        for (int i = 1; i <= 10; i++) {
            if (i == 10){
                nombreCaballo = "Caballo10";
            }else{
                nombreCaballo = "Caballo0"+i;
            }
            horses[i] = new Thread(new ThreadHorse(nombreCaballo));
            horses[i].start();
        }

        // Ajustar prioridades
        for (int i = 1; i<10; i++) {
            if (Objects.equals(horses[i].getName(), "Caballo 10")) {
                horses[i].setPriority(Thread.MAX_PRIORITY);
            } else if (Objects.equals(horses[i].getName(), "Caballo 1")) {
                horses[i].setPriority(Thread.MIN_PRIORITY);
                Thread.yield();
            } else {
                horses[i].setPriority(Thread.NORM_PRIORITY);
            }
        }
    }
}
