/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package criandoexcecaopropria;

/**
 *
 * @author Ricardo
 */
public class SenhaInvalidaException extends Exception{
    
    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
