/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Ricardo
 */
public class ClasseConta {
    private String nome;
    private double saldo;
    
    public ClasseConta(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
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
