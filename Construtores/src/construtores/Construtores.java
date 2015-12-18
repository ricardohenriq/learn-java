/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

/**
 *
 * @author Ricardo
 */
public class Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasseCarro carro = new ClasseCarro("Ferrari", 300, 3.2);
        System.out.print(carro.modelo+" ");
        System.out.print(carro.velocidadeMaxima+" ");
        System.out.println(carro.segundosZeroACem);
        
        ClasseCarro carro2 = new ClasseCarro();
        carro2.modelo = "Camaro";
        carro2.velocidadeMaxima = 250;
        carro2.segundosZeroACem = 4.2;
        System.out.print(carro2.modelo+" ");
        System.out.print(carro2.velocidadeMaxima+" ");
        System.out.println(carro2.segundosZeroACem);
    }
}
