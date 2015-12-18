/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Ricardo
 */
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasseCarro carro = new ClasseCarro("Ferrari", 300, 3.2, new ClasseMotor("V12", 660));
        System.out.print(carro.modelo+" ");
        System.out.print(carro.velocidadeMaxima+" ");
        System.out.print(carro.segundosZeroACem+" ");
        System.out.print(carro.motor.potencia+" ");
        System.out.println(carro.motor.tipo);
    }
}
