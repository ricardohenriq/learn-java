package collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {

    public static void main(String[] args) {
        String[] cores = {"Verde","Amarelo","Azul","Branco","Azul","Amarelo","Verde"};
        List<String> listaCores = Arrays.asList(cores);
        Set<String> setCores = new HashSet<>(listaCores);
        System.out.println(listaCores);
        System.out.println(setCores);
        
    }
}
