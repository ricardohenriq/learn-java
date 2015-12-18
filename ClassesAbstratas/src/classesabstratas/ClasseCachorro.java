/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesabstratas;

/**
 *
 * @author Ricardo
 */
//final implicara que ninguem pode extender da ClasseCachorro
public final class ClasseCachorro extends ClasseAnimal{
    
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
    
    //final implicara que nenhuma classe que extenda da ClasseCachorro
    //possa sobrescrever este metodo
    @Override
    public final void dormir(){
        System.out.println("RS RS RS");
    }
}
