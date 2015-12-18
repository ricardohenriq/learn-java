/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracoes;

/**
 *
 * @author Ricardo
 */
public class Enumeracoes {
    
    public static final double PI = 3.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(PecasXadrez.BISPO);
        System.out.println(EnumMedida.M);
        System.out.println(EnumMedida.M.titulo);
        
        //Percorrendo uma Enum
        for(EnumMedida m : EnumMedida.values()){
            System.out.println(m+" : "+m.titulo);
        }
        andar(EnumMedida.MM, 1000);
    }
    public static void andar(EnumMedida medida, int total){
        if(medida == EnumMedida.M){
            //...
        }
    }
}
