package Ejercicio2;

public class PokemonThread implements Runnable{
    private String msg;
    private Thread entrenador;

    public PokemonThread(String  msg, Thread entrenador) {
        this.msg = msg;
        this.entrenador = entrenador;
    }

    @Override
    public void run() {
        try {
            //Para indicar que el entrenador ha de ir antes
            entrenador.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(msg);
    }
}
