/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaafins;

/**
 *
 * @author Ricardo
 */
public class HerancaAfins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasseAnimal generico = new ClasseAnimal();
        ClasseCachorro cachorro = new ClasseCachorro(14,"Carne");
        System.out.println(cachorro.comida+"  "+cachorro.peso);
        cachorro.fazerBarulho();
        
        ClasseGalinha galinha = new ClasseGalinha();
        galinha.fazerBarulho();
        
        System.out.println(cachorro instanceof ClasseCachorro);
        System.out.println(cachorro instanceof ClasseAnimal);
        
        barulho(cachorro);
        barulho(galinha);
    }
    
    public static void barulho(ClasseAnimal generico){
        generico.fazerBarulho();
    }
}
