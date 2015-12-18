/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmutaveis;

/**
 *
 * @author Ricardo
 */
public class StringMutaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //AS DUAS CLASSES TEM O MESMO CONJUNTO DE METODOS
        //UNICA DIFERENCA E QUE OS DA StringBuffer SAO 
        //SINCRONIZADOS, MUITO UTIL EM AMBIENTES MULTIPROCESSADOS
        //TRABALHANDO COM VARIAS THREADS ACESSANDO OS MESMOS
        //OBJETOS StrinfBuffer.
        StringBuffer s1 = new StringBuffer();
        StringBuilder s2 = new StringBuilder("JAVA");
        //s1.capacity() IRA RETORNAR A CAPACIDADE DE ARMAZENAMENTO
        //DE NOVOS CARACTERES DENTRO DESTE OBJETOS SEM ALOCAR MAIS 
        //MEMORIA
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        System.out.println(s2.capacity());
        System.out.println(s2.length());
        System.out.println(s2.reverse());
        
        s2.reverse();
        s2.append(", C++");
        char[] linguagem = {',',' ','P','Y','T','H','O','N'};
        s2.append(linguagem);
        System.out.println(s2);
        
        StringBuffer s3 = new StringBuffer("Ricardo Henrique");
        System.out.println(s3.delete(0, 4));
    }
}
