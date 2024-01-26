package Ejercici2;

public class Main {
    public static void main(String[] args) {

        CajaFuerte cj = new CajaFuerte();

        Thread[] threads = new Thread[10000];

        for (int i = 0; i < threads.length ; i++) {

            threads[i] = new Thread(cj.new Incrementador());
            threads[i].start();

        }
        for (Thread th : threads){
            try {
                th.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(cj.getBalance());

    }
}
