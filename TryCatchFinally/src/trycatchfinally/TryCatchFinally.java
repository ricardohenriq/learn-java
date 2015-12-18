/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    
    public static void dividir(Scanner s) throws InputMismatchException{
        int numero = s.nextInt();  
    }
    
    public static void main(String[] args) {
             
        System.out.println("Digite um numero");
        Scanner s = new Scanner(System.in);
        boolean continua = true;
        
        do{
            try{
                dividir(s);
                continua = false;
            }catch(InputMismatchException | ArithmeticException e){
                e.printStackTrace();
                s.nextLine();//Descarta a entrada errada do sistema
            }finally{
                System.out.println("Finally Executado");
            }
        }while(continua == true);  
    }
}
