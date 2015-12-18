/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ricardo
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    
    public static void area(AreaCalculavel a){
        System.out.println(a.calculaArea());
    }
    
    public static void volume(VolumeCalculavel a){
        System.out.println(a.calculaVolume());
    }
    
    public static void main(String[] args) {
        
        Cubo c = new Cubo(2);
        //Como Cubo implementa estas duas interfaces
        // os Objetos a, c, v, sao do mesmo tipo
        AreaCalculavel a = c;
        VolumeCalculavel v = c;
        
        area(c);
        area(a);
        volume(v);
    }
}
