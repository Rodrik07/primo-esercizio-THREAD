package it.ramadani;

public class Cavalli extends Thread{
    private int cavalloNumero;

    public Cavalli(int cavalloNumero) {
        this.cavalloNumero = cavalloNumero;
    }

    public void run(){
        try {
            int tempoCorsa = (int) (Math.random() * 1000);
            Thread.sleep(tempoCorsa);
            System.out.println(Thread.currentThread().getName() + " - Cavallo numero: " + cavalloNumero + " ha finito in " + tempoCorsa + " ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
