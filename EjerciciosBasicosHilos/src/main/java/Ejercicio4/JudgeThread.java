package Ejercicio4;

import java.util.List;
import java.util.Random;


class JudgeThread extends Thread {
    private static final int numeroCaballos = 5;
    private static final int descansoJuez = 1000;

    private final List<Thread> caballos;

    public JudgeThread(List<Thread> horses) {
        this.caballos = horses;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < numeroCaballos; i++) {
            try {
                Thread.sleep(descansoJuez);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                int caballoABorrar = random.nextInt(caballos.size());
            //Se elige el caballo a borrar
                Thread disqualifiedHorse = caballos.get(caballoABorrar);
                //Se borra
                caballos.remove(caballoABorrar);
                //Mensaje de desclasificación e inturrupción del hilo del caballo elegido
                System.out.println("Juez: " + disqualifiedHorse.getName() + " descalificado. Total de descalificados: " + (i + 1));
                disqualifiedHorse.interrupt();

        }
    }
}