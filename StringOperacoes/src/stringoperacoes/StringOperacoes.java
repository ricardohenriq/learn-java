/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperacoes;

/**
 *
 * @author Ricardo
 */
public class StringOperacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "Ricardo";
        String s2 = s1+"Henrique";
        String s3 = new String();
        String s4 = new String("Inacio");
        char[] s5 = {'R','I','C','A','R','D','O'};
        String s6 = new String(s5);
        
        //OPERACOES BASICAS
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        
        //LOCALIZACAO
        System.out.println(s2.indexOf('r'));
        System.out.println(s2.lastIndexOf('r'));
        System.out.println(s1.indexOf("rdo"));
        System.out.println(s2.indexOf(s1));
        
        //COMPARACAO
        System.out.println(s1.equals("Ricardo"));
        System.out.println(s1.equals("RICARDO"));
        System.out.println(s1.equalsIgnoreCase("RICARDO"));
        System.out.println(s1.startsWith("Ric"));
        System.out.println(s1.startsWith("icar"));
        System.out.println(s1.endsWith("rdo"));
        System.out.println("Doutor".compareTo("Doutora"));
        System.out.println("Doutora".compareTo("Doutor"));
        System.out.println("Doutor".compareTo("Fuzil"));
        System.out.println("Doutor".compareTo("Doutor"));
        System.out.println("123".compareTo("234"));
        
        System.out.println("Olhe, olhe!".regionMatches(6, "Olhe", 0, 4));
        System.out.println("Olhe, olhe!".regionMatches(true, 6, "Olhe", 0, 4));
        
        //EXTRACAO
        String s7 = "Ricardo Henrique";
        String s8 = s7.substring(3);
        String s9 = s7.substring(3,9);
        String s10 = s7.concat(" Inacio ".concat("da Silva"));
        String s11 = s7.replace('i','I');
        String s12 = s7.replaceFirst("i","I");
        String s13 = s7.replaceAll("i","I");
        String s14 = s7.toUpperCase();
        System.out.println(s14);
        System.out.println(s13);
        System.out.println(s12);
        System.out.println(s11);
        System.out.println(s10);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println("   espacos   ");
        System.out.println("   espacos   ".trim());
        System.out.println("   esp  acos   ".trim());
    }   
}
