/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsplittokensdelimitadores;

/**
 *
 * @author Ricardo
 */
public class StringSplitTokensDelimitadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "XHTML; CSS; JAVA";
        String[] s1Tokens = s1.split("; ");
        System.out.println(s1Tokens.length);
        for(String token: s1Tokens){
            System.out.println(token);
        }   
    }
}
