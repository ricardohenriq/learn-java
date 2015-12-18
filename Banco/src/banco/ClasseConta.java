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
    String nome;
    double saldo;
    
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
