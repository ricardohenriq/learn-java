/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Ricardo
 */
public class ClasseCarro {
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    ClasseMotor motor;
    
    public ClasseCarro(String modelo, int velocidadeMaxima, double segundosZeroACem){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }
    public ClasseCarro(String modelo, int velocidadeMaxima, double segundosZeroACem, ClasseMotor motor){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }
}
