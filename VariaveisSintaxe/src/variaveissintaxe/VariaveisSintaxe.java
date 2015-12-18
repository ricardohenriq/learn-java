/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveissintaxe;

/**
 *
 * @author Ricardo
 */
public class VariaveisSintaxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char sexo = 'M';
        System.out.println("char = "+sexo);
        String nome = "Ricardo";
        System.out.println("String = "+nome);
        char[] nomeArrayChar = nome.toCharArray();
        System.out.println("vetor de char = "+nomeArrayChar[0]+nomeArrayChar[1]);
        char sobrenome[] = {'S','i','l','v','a'};
        String stringSorbreNome = new String(sobrenome);
        System.out.println("String = "+stringSorbreNome);
        boolean estado = true;
        System.out.println("boolean estado = "+estado);
        boolean estado2 = false;
        System.out.println("boolean estado2 = "+estado2);
        byte minByte = Byte.MIN_VALUE;
        System.out.println("byte MIN_VALUE = "+minByte);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("byte MAX_VALUE = "+maxByte);
        short minShort = Short.MIN_VALUE;
        System.out.println("short MIN_VALUE = "+minShort);
        short maxShort = Short.MAX_VALUE;
        System.out.println("short MAX_VALUE = "+maxShort);
        int minInt = Integer.MIN_VALUE;
        System.out.println("int MIN_VALUE = "+minInt);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("int MAX_VALUE = "+maxInt);
        long minLong = Long.MIN_VALUE;
        System.out.println("long MIN_VALUE = "+minLong);
        long maxLong = Long.MAX_VALUE;
        System.out.println("long MAX_VALUE = "+maxLong);
        float minFloat = Float.MIN_VALUE;
        System.out.println("float Min_VALUE = "+minFloat);
        float maxFloat = Float.MAX_VALUE;
        System.out.println("float MAX_VALUE = "+maxFloat);
        double minDouble = Double.MIN_VALUE;
        System.out.println("double MIM_VALUE = "+minDouble);
        double maxDouble = Double.MAX_VALUE;
        System.out.println("double MAX_VALUE = "+maxDouble);
    }
}
