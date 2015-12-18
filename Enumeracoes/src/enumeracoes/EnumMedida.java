/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracoes;

/**
 *
 * @author Ricardo
 */
public enum EnumMedida {
    //Construtores que so podem ser chamedos pela propria 
    //Enum
    MM("Milimetro"), CM("Centimetro"), M("Metro");
    public String titulo;
    EnumMedida(String titulo){
        this.titulo = titulo;
    }
}
