package contacrud;

public class Conta {
    int numero;
    String nome;
    double saldo;
    public Conta(int numero,String nome,double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return numero+", "+nome+", "+saldo; 
    }
}
