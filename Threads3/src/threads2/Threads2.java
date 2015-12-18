package threads2;

public class Threads2 {

    public static void main(String[] args) {
        PilhaSincronizada pilha = new PilhaSincronizada();
        Produtor produtor = new Produtor(pilha);
        Consumidor consumidor = new Consumidor(pilha);
        
        Thread t1 = new Thread(produtor);
        Thread t2 = new Thread(consumidor);
        
        pilha.push(31);
        
        t1.start();
        t2.start();
    }
    
}
