package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");
        System.out.println(c.toString());
        System.out.println(c.isEmpty());
        System.out.println(c.contains("a"));
        
        c.remove("C");
        System.out.println(c.toString());
        
        //GRUPOS
        //Arrays E UMA CLASSE UTILITARIA
        Collection<String> d = Arrays.asList("a","b");
        System.out.println(d.toString());
        c.addAll(d);
        System.out.println(c.toString());
        System.out.println(c.containsAll(d));
        c.removeAll(d);
        System.out.println(c.toString());
        
        String[] arrayStrings = c.toArray(new String[c.size()]);
        for(String item : arrayStrings){
            System.out.println(item);
        }
        System.out.println(Arrays.toString(arrayStrings));
        c.clear();
        System.out.println(c.toString());
    }
}
