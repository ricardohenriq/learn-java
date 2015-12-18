package threads2;

public class Produtor implements Runnable{
    PilhaSincronizada pilha;
    
    public Produtor(PilhaSincronizada pilha){
        this.pilha = pilha;
    }
    
    @Override
    public void run() {
        int colorIdx;
        for(int i = 0; i < 10; i++){
            colorIdx = (int)(Math.random() * 100);
            pilha.push(colorIdx);
            System.out.println("Criado: "+colorIdx);
            try{
                Thread.sleep((int)(Math.random()*5000));
            }catch(Exception e){}
        }
    }
    
}
