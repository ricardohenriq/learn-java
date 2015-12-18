package threads4waitnotifyall;

public class PonteNaoSincronizada implements InterfacePonte{

    //REPRESENTA O VALOR ARMAZENADO NESTA PONTE
    private int valor = -1;
    
    @Override
    public void set(int valor) throws InterruptedException {
        System.out.print("Produziu: "+valor);
        this.valor = valor;
    }

    @Override
    public int get() throws InterruptedException {
        System.err.print("Cosumiu: "+valor);
        return valor;
    }
    
}
