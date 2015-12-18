package threads4waitnotifyall;

public class Threads4waitnotifyAll {

    public static void main(String[] args) {
        //THREADS PRODUTORAS
        //PONTE
        //THREADS CONSUMIDORAS
        
        InterfacePonte ponte = new PonteSincronizada();
        new Thread(new ClasseProdutor(ponte)).start();
        new Thread(new ClasseConsumidor(ponte)).start();
        
    }
}
