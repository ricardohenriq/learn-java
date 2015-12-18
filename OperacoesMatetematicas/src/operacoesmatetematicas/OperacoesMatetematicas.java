/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesmatetematicas;

/**
 *
 * @author Ricardo
 */
public class OperacoesMatetematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcule(new Soma(), 5, 5);
        calcule(new Multiplicacao(), 5, 5);
    }
    
    public static void calcule(Operacoes o, double x, double y){
        System.out.println(o.calcular(x, y));
    }
}
