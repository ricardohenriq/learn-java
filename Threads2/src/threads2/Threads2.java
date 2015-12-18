package threads2;

public class Threads2 implements Runnable{
    
    String palavra;
    long tempo;
    public Threads2(String palavra, long tempo){
        this.palavra = palavra;
        this.tempo = tempo;
    }
    
    @Override
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                System.out.println(palavra);
                Thread.sleep(tempo);
            }
        }catch(InterruptedException ex) {
            return;
        }
    }
    
    public static void main(String[] args) {
        //EXEMPLO PING PONG IMPLEMENTANDO 
        //A INTERFACE Runnable
        Runnable ping = new Threads2 ("ping",1500);
        Runnable pong = new Threads2 ("PONG",1500);
        new Thread(ping,"ping").start();
        new Thread(pong,"PONG").start();
    }
}

