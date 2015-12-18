package threads3synchronized;

    
    
public class ClasseContaConjunta {
    private int saldo = 100;
    
    public int getSaldo(){
        return saldo;
    }
    
    public synchronized void sacar(int valor, String cliente){
        if(saldo>valor){
            System.out.println(cliente+" Vai sacar");
            try{
                System.out.println(cliente+" Esperando");
                saldo -= valor;
                Thread.sleep(2000);
            }catch(InterruptedException e){/*VAZIO EMPTY*/}
            String msg = cliente+" sacou "+valor+" saldo atual: "+saldo;
            System.out.println(msg);
        }else{
            System.out.println("Saldo insulficiente");
        }
    }
}
