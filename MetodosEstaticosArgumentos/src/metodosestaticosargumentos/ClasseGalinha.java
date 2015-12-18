/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticosargumentos;

/**
 *
 * @author Ricardo
 */
public class ClasseGalinha {
    
    public static int ovosDaGranja;//variavel global
    public int ovos;//Total de ovos do objeto galinha
    public static double mediaDeOvos(int numGalinhas){
        return ClasseGalinha.ovosDaGranja/numGalinhas;
    }
    
    public void botar(){
        this.ovos++;
        ClasseGalinha.ovosDaGranja++;
    }
    /*
    public Galinha botar(){
        this.ovos++;
        return this;
    }
    */
}
