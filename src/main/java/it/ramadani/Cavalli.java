package it.ramadani;

public class Cavalli extends Thread{
    private int numCav;

    public Cavalli(int c) {
        this.numCav = c;
    }

    public void run(){
        try {
            int tempoCorsa = (int) (Math.random() * 1000);
            Thread.sleep(tempoCorsa);
            System.out.println(Thread.currentThread().getName() + " - Cavallo numero: " + numCav + " ha finito in " + tempoCorsa + " ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
