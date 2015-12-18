/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesabstratas;

/**
 *
 * @author Ricardo
 */
public abstract class ClasseAnimal {
    
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
    
    abstract public void fazerBarulho();
}
