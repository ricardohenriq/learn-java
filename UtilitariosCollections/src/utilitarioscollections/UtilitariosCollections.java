package utilitarioscollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilitariosCollections {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Guarana");
        frutas.add("Uva");
        frutas.add("Manga");
        frutas.add("Coco");
        frutas.add("Acai");
        frutas.add("Banana");
        System.out.println(frutas);
        Collections.sort(frutas);      
        System.out.println(frutas);
        Collections.reverse(frutas);      
        System.out.println(frutas);
        //shuffle EMBARALHA A COLECAO
        Collections.shuffle(frutas);      
        System.out.println(frutas);
        Collections.addAll(frutas,"Cupuacu","Laranja");      
        System.out.println(frutas);     
        System.out.println(Collections.frequency(frutas, "Laranja"));
        List<String> frutas2 = Arrays.asList("Acelora","Graviola");
        System.out.println(Collections.disjoint(frutas, frutas2));
        Collections.sort(frutas);
        System.out.println(Collections.binarySearch(frutas, "Guarana"));
        Collections.fill(frutas,"Acai");
        System.out.println(frutas);
        //COLECAO NAO MODIFICAVEL
        Collection<String> frutasConstante;
        frutasConstante = Collections.unmodifiableCollection(frutas);
        
    }
}
