/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticosargumentos;

/**
 *
 * @author Ricardo
 */
public class MetodosEstaticosArgumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseGalinha galinha = new ClasseGalinha();
        galinha.botar();
        galinha.botar();
        galinha.botar();
        /*Geito mais complexo abaixo
        galinha.botar().botar().botar();
        */
        System.out.println(galinha.ovos);
        ClasseGalinha galinha2 = new ClasseGalinha();
        galinha2.botar();
        galinha2.botar();
        System.out.println(galinha2.ovos);
        System.out.println(ClasseGalinha.ovosDaGranja);
        System.out.println(ClasseGalinha.mediaDeOvos(2));
    }
}
