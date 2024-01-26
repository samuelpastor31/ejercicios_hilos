package Ejercicio3;

public class ThreadHorse implements Runnable {

    private double distancia;
    private double distanciaPasos;
    private long descansos;
    private String nombreCaballo;

    public ThreadHorse(String nombreCaballo) {
        this.distancia = 5000;
        this.distanciaPasos = 100;
        this.descansos = 200;
        this.nombreCaballo = nombreCaballo;
    }

    @Override
    public void run() {
        for (int i = 0; i < distancia; i++) {
            if (i % distanciaPasos == 0) {
                double distanciaRestante = distancia - i;
                System.out.println(nombreCaballo + ": " + distanciaRestante + "m para finalizar");
                try {
                    if (nombreCaballo.equals("Caballo01")) {
                        Thread.sleep(202);
                    }else if(nombreCaballo.equals("Caballo10")){
                        Thread.sleep(198);
                    }else{
                        Thread.sleep(descansos);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException("El juez ha parado el "+nombreCaballo);
                }
            }
        }
        System.out.println(nombreCaballo + ": Ha finalizado");
    }
}
