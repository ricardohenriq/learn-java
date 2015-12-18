/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaafins;

/**
 *
 * @author Ricardo
 */
public class ClasseCachorro extends ClasseAnimal{
    
    public ClasseCachorro(){
        super(30, "Carne");
    }
    
    public ClasseCachorro(double peso, String comida){
        super(peso, comida);
    }
    
    @Override
    public void fazerBarulho(){
        System.out.println("Au! Au!");
    }
}
