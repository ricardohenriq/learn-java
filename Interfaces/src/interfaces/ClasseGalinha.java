/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ricardo
 */
public class ClasseGalinha extends ClasseAnimal implements AreaCalculavel{
    
    public ClasseGalinha(){
        super(5, "Milho");
    }
    
    @Override
    public void fazerBarulho(){
        System.out.println("Coco! Coco!");
    }

    @Override
    public double calculaArea() {
        
        return 0;
    }
}
