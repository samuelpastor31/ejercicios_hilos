package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        //Se crea array de hilos de caballos y se instancia Juez con este
        List<Thread> horses = new ArrayList<>();
        JudgeThread judge = new JudgeThread(horses);

        //Se añaden los caballos al array
        for (int i = 1; i <= 10; i++) {
            ThreadHorse horse = new ThreadHorse("Caballo" + i);
            horses.add(new Thread(horse));
        }

        //Se inician los Caballos y el juez accede a estos de manera sincronizada
        for (Thread horse : horses) {
            horse.start();
        }

        judge.start();
    }
}

