package Ejercicio2;

public class TrainerThread implements Runnable{
    private String msg;

    public TrainerThread(String  msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
    }
}
