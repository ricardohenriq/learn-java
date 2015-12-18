package threads1;


public class Threads1 extends Thread{
    
    String palavra;
    long tempo;
    public Threads1(String palavra, long tempo){
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
        //EXEMPLO PING PONG
        new Threads1("Ping",1500).start();
        new Threads1("Pong",2000).start();
        System.out.println("Ver Thread");
        
    }
}
