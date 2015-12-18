/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresafins;

/**
 *
 * @author Ricardo
 */
public class ClasseFuncionario {
    private String nome;
    private boolean ativo;
    
    public ClasseFuncionario(String nome){
        this.nome = nome;
    } 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAtivo(){
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
