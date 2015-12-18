/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ricardo
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pais = "EUA";
        String[] paises = {"EUA","Inglaterra","Russia"};
        
        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 2;
        numeros[2] = 9;
        
        System.out.println(numeros.length);
        System.out.println(Arrays.toString(numeros));
        
        int posicao = Arrays.binarySearch(paises, pais);
        System.out.println("Posicao : "+posicao);
        
        Arrays.sort(numeros, 0, numeros.length);
        System.out.println(Arrays.toString(numeros));
        
        Double[] valores = {12.3, 32.4};
        double valor = valores[0].doubleValue();
        
        String[][] matriz = {
            {"Ricardo","BRAZIL"},
            {"Bill Gates","EUA"}
        };
        
        String[] faces = {"As","2","3","4","5","6","7","8","9","10"};
        String[] naipes = {"Ouro","Espada","Paus","Copas"};
        
        Random r = new Random();
        System.out.println(faces[r.nextInt(faces.length)]+" de "+naipes[r.nextInt(naipes.length)]);

        ArrayList<String> cores = new ArrayList();
        cores.add("Branco");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Preto");
        System.out.println(cores.toString());
        System.out.println(cores.size());
        System.out.println(cores.get(2));
        System.out.println(cores.indexOf("Preto"));
        System.out.println(cores.indexOf("Amarelo"));
        cores.remove("Branco");
        System.out.println(cores.contains("Amarelo"));
    }
}
