package classessystemruntime;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ClassesSystemRuntime {

    public static void main(String[] args) throws IOException {
        Properties propriedades = System.getProperties();
        System.out.println(propriedades.getProperty("java.version"));
        
        Set<Object> pk = propriedades.keySet();
        for(Object key : pk){
            System.out.println(key+" = "+propriedades.get(key));
        }
        //CLASSE Console SERVE POR EXEMPLO PARA PEGAR A SENHA 
        //SEM MOSTRAR OS CARACTERES //EXECUTAR PELO PROMPT  
        Console c = System.console();
        System.out.println("Usuario: ");
        String user = c.readLine();
        System.out.println("Senha: ");
        char[] pass = c.readPassword();
        System.out.println("Usuario: "+user+"\nSenha: "+new String(pass));
        
        
        Runtime.getRuntime().exec("notepad");
    }
}
