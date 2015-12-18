/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ricardo
 */
public class ExpressoesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String padrao = "Java";
        String texto = "Java";
        System.out.println(texto.matches(padrao));
        System.out.println(texto.matches("java"));
        
        /** MODIFICADORES
         * (?i) IGNORA MAISCULA E MINUSCULA
         * (?x) COMENTARIOS
         * (?m) MULTILINHAS
         * (?s) DOTTAL
        **/
        System.out.println(texto.matches("(?im)java"));
        
        /** META CARACTERES
         * . QUALQUER CARACTERE
         * \d DIGITO                [0-9]
         * \D NAO E DIGITO          [^0-9]
         * \s ESPACOS               [ \t\n\x0B\f\r]
         * \S NAO E ESPACOS         [^\s]
         * \w LETRA ALFANUMERICO    [a-zA-Z_0-9]
         * \W NAO E LETRA OU ALFANUMERICO 
        **/
        System.out.println("@".matches("."));
        System.out.println("2".matches("\\d"));
        System.out.println("22".matches("\\d\\d"));
        System.out.println("PI".matches("."));
        System.out.println("PI".matches(".."));
        System.out.println("86456-278".matches("\\d\\d\\d\\d\\d-\\d\\d\\d"));
        
        /** QUANTIFICADORES 
         * X{n}     X, EXATAMENTE n VEZES
         * X{n, }   X, PELO MENOS n VEZES          
         * X{n, m}  X, PELO MENOS n MAS NAO MAIS DO QUE m VEZES    
         * X?       X, 0 OU 1 VEZES       
         * X*       X, 0 OU + VEZES 
         * X+       X, 1 OU + VEZES 
        **/
        System.out.println("86456-278".matches("\\d{5}-\\d{3}"));
        System.out.println("".matches(".?"));
        System.out.println("12/12/1993".matches("\\d{2}/\\d{2}/\\d{4}"));
        
        /** META CARACTERES DE FRONTEIRA
         * ^ INICIA
         * $ FINALIZA
         * | OU
        **/
        System.out.println("RICARDO".matches("^RIC"));
        System.out.println("RICARDO".matches("^RIC.*"));
        System.out.println("RICARDO".matches(".*ARDO$"));
        System.out.println("ESTADOS UNIDOS DA AMERICA".matches(".*UNIDOS.*"));
        System.out.println("ESTADOS UNIDOS DA AMERICA".matches("^ESTADOS.*AMERICA$"));
        System.out.println("SIM".matches("SIM|NAO"));
        
        /** AGRUPADORES
         * [...]            AGRUPAMENTO EX: [abc]
         * [a-z]            ALCANCE 
         * [a-e][i-u]       UNIAO       
         * [a-z&&[aeiou]]   INTERSECAO        
         * [^abc]           EXCECAO
         * [a-z&&[^m-p]]    SUBTRACAO
         * \x               FUGA LITERAL
        **/
        System.out.println("e".matches("[a-f]"));
        System.out.println("g".matches("[a-f]"));
        System.out.println("3".matches("[a-f]"));
        System.out.println("A".matches("[a-f]"));
        System.out.println("3".matches("[0-6]"));
        System.out.println("true".matches("[tT]rue"));
        System.out.println("True".matches("[tT]rue"));
        System.out.println("TRue".matches("[tT]rue"));
        System.out.println("Yes".matches("[tT]rue|[yY]es"));
        //PRIMEIRA LETRA SEMPRE MAIUSCULA
        System.out.println("Ricardo".matches("[A-Z][a-zA-z]*"));
        System.out.println("alho".matches("[^abc]lho"));
        System.out.println("ricardo@outlook.com".matches("\\w+@\\w+\\.\\w{2,3}"));        
        String s = "Qual e o Doce mais doce que o DOCE";
        //MUITO UTIL PARA COMPARACAO FEITA MULTIPLAS VEZES
        Matcher m = Pattern.compile("(?i)doce").matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
        
        //SUBSTITUICOES
        String s1 = s.replaceAll("(?i)doce", "DOCINHO");
        System.out.println(s1);
        
        String s2 = "O rato roeu a roupa do rei de roma";
        String s3 = s2.replaceAll("r[aeiou]", "XX");
        System.out.println(s3);
        
        String s4 = "TEXTO TEXTO TEXTO";
        String s5 = s4.replaceAll("\\s", "\n");
        System.out.println(s5);
        
        String url = "www.xti.com.br/clientes-2011.html";
                   //http://www.xti.com.br/2011/clientes.jsp
        String re = "(www.xti.com.br)/(\\w{2,})-(\\w{4}).html";
        System.out.println(url.matches(re));
        
        String re2 = "http://$1/$3/$2.jsp";
        String novaUrl = url.replaceAll(re, re2);
        System.out.println(novaUrl);
    }
}
