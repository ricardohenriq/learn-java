package reflection;

public class ClasseConta {
    public String nome;
    public double saldo;
    
    public ClasseConta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    
    void exibeSaldo(){
        System.out.println("Cliente "+nome+" Saldo de R$ "+saldo);
    }
    void saca(double valor){
        saldo -= valor;
        System.out.println("Cliente "+nome+" Saldo de R$ "+saldo);
    }
    void deposita(double valor){
        saldo += valor;
        System.out.println("Cliente "+nome+" Saldo de R$ "+saldo);
    }
    void transferencia(ClasseConta destino, double valor){
        saldo -= valor;
        destino.deposita(valor);
        System.out.println("Cliente "+nome+" Saldo de R$ "+saldo);
    }     
}
