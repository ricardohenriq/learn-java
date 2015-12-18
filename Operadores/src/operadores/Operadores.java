/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2 + 3 Operador Binario
        // -1 Operador Unario
        // (int)4.5 (cast) Operador Unario
        // true ? System.out.println("Verdadeiro") : System.out.println("Falso")
        // Operador Ternario
        
        String s = JOptionPane.showInputDialog("Digite seu peso");
        double peso = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Digite sua altura");
        double altura = Double.parseDouble(s);
        double IMC = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, IMC);
 
    }
}
