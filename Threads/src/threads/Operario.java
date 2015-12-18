package threads;

public class Operario implements Runnable{
    String produto; int tempo;
     public Operario(String produto, int tempo){
        this.produto = produto;
        this.tempo = tempo;
    }
     public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println(i + " " + produto);
            try{
               Thread.sleep((long)(Math.random() * tempo));
            }catch(InterruptedException e){
                //
            }
        }
        System.out.println("Terminei " + produto);
     } 
}
