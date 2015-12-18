/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assertions;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Assertions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero em 0 e 10");
        int numero = s.nextInt();
        
        assert(numero >= 0 && numero <= 10) : "Numero invalido "+numero;
        System.out.println("Voce digitou: "+numero);
        
    }
}
