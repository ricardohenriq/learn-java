/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ricardo
 */
public class Quadrado implements AreaCalculavel{

    double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
        
    @Override
    public double calculaArea() {
        return lado * lado;
    }
    
}
