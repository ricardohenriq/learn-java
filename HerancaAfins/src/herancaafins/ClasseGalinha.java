/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaafins;

/**
 *
 * @author Ricardo
 */
public class ClasseGalinha extends ClasseAnimal{
    
    public ClasseGalinha(){
        super(5, "Milho");
    }
    
    @Override
    public void fazerBarulho(){
        System.out.println("Coco! Coco!");
    }
}
