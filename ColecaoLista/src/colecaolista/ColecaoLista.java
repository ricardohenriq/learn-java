package colecaolista;

import java.util.ArrayList;
import java.util.List;

public class ColecaoLista {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Futebol");
        lista.add("Basquete");
        lista.add("Tenis");
        lista.add("Volei");
        lista.add("Natacao");
        lista.add("Hockey");
        lista.add("Boxe");
        lista.add("Futebol");
        System.out.println(lista.toString());
        
        for(int i = 0; i < lista.size(); i++){
            String esporte = lista.get(i);
            lista.set(i, esporte.toUpperCase());
            System.out.println(lista.get(i));
        } 
        System.out.println(lista.indexOf("BOXE"));
        System.out.println(lista.subList(2, 4));
        lista.subList(2, 4).clear();
        System.out.println(lista);
    }
}
