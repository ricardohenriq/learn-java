/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Ricardo
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseConta conta = new ClasseConta("Ricardo",100000);
        conta.exibeSaldo();
        conta.saca(3000);
        conta.deposita(4000);
        
        ClasseConta destino = new ClasseConta("Henrique",50000);
        conta.transferencia(destino, 2000);
    }
}
