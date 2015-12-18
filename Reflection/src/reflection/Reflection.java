package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Exception{
        String nome = "reflection.ClasseConta";
        Class classe = Class.forName(nome);
        System.out.println(classe);
        System.out.println(classe.getSimpleName());
        //RETORNA CAMPOS PUBLICOS
        Field[] campos = classe.getFields();
        System.out.println("Variaveis Publicas");
        for(Field campo : campos){
            System.out.println(campo);
        }
        
        Method[] metodos = classe.getDeclaredMethods();
        System.out.println("Todos os Metodos");
        for(Method metodo : metodos){
            System.out.println(metodo);
        }
        
        Constructor[] construtores = classe.getConstructors();
        System.out.println("Todos os Construtores");
        for(Constructor construtor : construtores){
            System.out.println(construtor);
        }
        Object objeto = classe.newInstance();
        //RECUPERAE METODO DA CLASSE
        Method md = classe.getMethod("deposita", double.class);
        //INVOCACAO DESTE METODO md NESTE OBJETO objeto
        md.invoke(objeto, 120);
        
        Method me = classe.getMethod("exibeSaldo");
        me.invoke(objeto);
    }
}
