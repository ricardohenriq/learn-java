package threads4waitnotifyall;

public class PonteSincronizada implements InterfacePonte{
    
    //REPRESENTA O VALOR ARMAZENADO NESTA PONTE
    private int valor = -1;
    private boolean ocupada = false;
    
    @Override
    public synchronized void set(int valor) throws InterruptedException {
        
        while(ocupada){
            //ESTA AGUARDANDO ATE QUE UMA CLASSE CONSUMIDORA 
            //LEIA O VALOR DA PONTE
            System.out.println("Ponte Cheia. Produtor Deve Aguardar");
            //FAZ COM QUE A THREAD QUE ESTA EXECUTANDO ESTE METODO
            //AGUARDE
            wait();
        }
        System.out.print("Produziu: "+valor);
        this.valor = valor;
        ocupada = true;
        //SERVE PARA INDICAR PRA TODAS AS THREADS QUE ESTAVAM AGUARDANDO
        //A MODIFICACAO DO STATUS DESTA PONTE PARA CONTINUAR SUA EXCECUCAO
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while(!ocupada){
            System.out.println("Ponte Vazia. Consumidor Deve Aguardar");
            wait();
        }
        System.err.print("Cosumiu: "+valor);
        ocupada = false;
        notifyAll();
        return valor;
    }
    
}
