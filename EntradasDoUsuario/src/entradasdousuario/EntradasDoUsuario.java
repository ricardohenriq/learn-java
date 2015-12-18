/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasdousuario;

/**
 *
 * @author Ricardo
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradasDoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        System.out.println(nome);
        
        String sobreNome = JOptionPane.showInputDialog("Digite seu Sobrenome");
        JOptionPane.showMessageDialog(null, "Seu Sobrenome e: "+sobreNome);
    }
}
