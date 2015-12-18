package threads3synchronized;
           
public class Threads3synchronized implements Runnable{

    ClasseContaConjunta contaMultiThread = new ClasseContaConjunta();
    
    @Override
    public void run(){
        String nomeCliente = Thread.currentThread().getName();
        for(int i = 0;i < 5;i++){
            contaMultiThread.sacar(20,nomeCliente);
            if(contaMultiThread.getSaldo() < 0){
                System.out.println("Estorou");
            }
        }   
    }
    
    public static void main(String[] args) {
        //BANCO MULTI THREAD
        Threads3synchronized irAsCompras = new Threads3synchronized();
        new Thread(irAsCompras,"Pai").start();
        new Thread(irAsCompras,"Mae").start();
        new Thread(irAsCompras,"Filha").start();
        new Thread(irAsCompras,"Baba").start();
        
    }
}
