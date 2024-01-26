package Ejercici2;

public class CajaFuerte {

    private int balance;


    public CajaFuerte(){
        balance = 0;
    }


    public synchronized void incrementarBalance(){
        balance++;
    }

    public int getBalance() {
        return balance;
    }

    class Incrementador implements Runnable{

        @Override
        public void run() {
            incrementarBalance();
        }
    }
}