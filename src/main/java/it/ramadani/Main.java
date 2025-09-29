package it.ramadani;

public class Main {
    public static void main(String[] args) { 
        int num = 10;
        Thread[] threads = new Thread[num]; 
        
        for(int i = 0; i < num; i++ ){
            Cavalli cavalli = new Cavalli(i + 1);
            threads[i] = cavalli;
            cavalli.start();

        }
        
    }
}