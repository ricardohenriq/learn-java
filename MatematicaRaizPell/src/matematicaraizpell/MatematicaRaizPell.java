/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicaraizpell;

/**
 *
 * @author Ricardo
 */
public class MatematicaRaizPell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseMatematica matematica = new ClasseMatematica();
        System.out.println(matematica.soma(10, 5));
        System.out.println(matematica.maior(10, 5));
        System.out.println(matematica.raiz(276));
        System.out.println(Math.sqrt(276));
        
        System.out.println(matematica.soma("Calculo",10, 5, 5, 3, 9));
    }
}
