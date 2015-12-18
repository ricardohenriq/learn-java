/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresdefluxo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class OperadoresDeFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 3;
        char sexo = 'M';
        
        if(numero%2 == 0){
            System.out.println("Par");
        }else if(numero == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Impar");
        }
        
        switch(sexo){
            case 'M':
            case 'm':
                System.out.println("Macho");
                break;
            case 'F':
                System.out.println("Femea");
                break;
            default:
                System.out.println("Outro");
        }
        
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
        
        ArrayList<String> cores = new ArrayList();
        cores.add("BRANCO");
        cores.add("VERDE");
        cores.add("AZUL ");
        //foreach
        for(String cor:cores){
            System.out.println(cor);
        }
        
        int cont = 5;
        while(cont>0){
            System.out.println("cont == "+cont);
            cont--;
        }
        
        int entrada;
        do{
            Scanner s = new Scanner(System.in);
            entrada = s.nextInt();
        }while(entrada <0);
        
        while(true){
            System.out.println(cont);
            break;
        }
        
        for(int i=0;i<7;i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
        
        int[][] matriz = new int[2][2];
        matriz[0][0] = 0; matriz[0][1] = 1; matriz[1][0] = 0; matriz[1][1] = 0;
        
        busca:
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]==1){
                    System.out.println("Encontrou");
                    break busca;
                }
            }
        }
        
    }
}
