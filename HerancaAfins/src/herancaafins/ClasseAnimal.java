/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaafins;

/**
 *
 * @author Ricardo
 */
public class ClasseAnimal {
    
    double peso;
    String comida;
    protected int serial;
    
    public ClasseAnimal(){
        
    }
    
    public ClasseAnimal(double peso, String comida){
        this.peso = peso; this.comida = comida;
    }
    
    public void dormir(){
        System.out.println("Dormiu");
    }
    
    public void fazerBarulho(){
        System.out.println("Fazer Barulho");
    }
}
