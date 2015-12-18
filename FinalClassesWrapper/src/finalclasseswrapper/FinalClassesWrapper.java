/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalclasseswrapper;

/**
 *
 * @author Ricardo
 */
public class FinalClassesWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raio = 4.3;
        final double CONSTANTE_PI = 3.14;
        
        Integer idade = new Integer(15);
        System.out.println("Wrapper idade = "+idade);
        Double peso = new Double("69.99");
        System.out.println("Wrapper peso = "+peso);
        
        int intIdade = idade.intValue();
        System.out.println("Primitivo idade = "+intIdade);
        double doublePeso = peso.doubleValue();
        System.out.println("Primitivo peso = "+doublePeso);
        
        //CONVERSAO ESTATICA
        String stringAltura = "1.85";
        double altura = Double.parseDouble(stringAltura);
        System.out.println("Primitivo altura = "+altura);
        
        int numero = Integer.parseInt("150");
        int numero2 = Integer.valueOf("101011",2);
        System.out.println("Primitivo numero2 = "+numero2);
    }
}
