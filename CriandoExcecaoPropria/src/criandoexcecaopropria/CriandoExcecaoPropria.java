/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package criandoexcecaopropria;

/**
 *
 * @author Ricardo
 */
public class CriandoExcecaoPropria {

    public static void autenticar(String senha)throws SenhaInvalidaException{
        if("123".equals(senha)){
            //autenticado
            System.out.println("Autenticado");
        }else{
            throw new SenhaInvalidaException("Senha Incorreta");
        }
    }
    
    public static void main(String[] args) {
        try{
            autenticar("1233");
        }catch(SenhaInvalidaException e){
            System.err.println(e.getMessage());
        }
    }
}
