package Ejercicio5;

import java.util.Objects;

public class Animal implements Runnable{

    private int distancia;
    private int incremento;
    private int descanso;
    private String nombreAnimal;

    public Animal(int distancia, int incremento, int descanso, String nombreAnimal) {
        this.distancia = distancia;
        this.incremento = incremento;
        this.descanso = descanso;
        this.nombreAnimal = nombreAnimal;
    }

    @Override
    public void run() {
        int distanciaFaltante = distancia;
        int distanciaCompletada = 0;
        while (distanciaCompletada < distancia) {
                distanciaFaltante = distanciaFaltante - incremento;
                distanciaCompletada = distancia - distanciaFaltante;
                System.out.println(nombreAnimal + " ha completado ya " + distanciaCompletada + "m de distancia");
                try {
                    if (Objects.equals(nombreAnimal, "Guepardo")) {
                        Thread.sleep(descanso-6);
                    }else if (Objects.equals(nombreAnimal, "Conejo")) {
                        Thread.sleep(descanso-3);
                    }else {
                        Thread.sleep(descanso);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        System.out.println(nombreAnimal+" ha completado la carrera");
    }
}
