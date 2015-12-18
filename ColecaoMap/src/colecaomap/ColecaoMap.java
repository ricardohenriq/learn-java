package colecaomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

    public static void main(String[] args) {
        Map<String,String> paises = new HashMap<>();
        paises.put("BR", "Brasil");
        paises.put("RU", "Russia");
        paises.put("IN", "India");
        paises.put("CN", "China");
        System.out.println(paises);
        System.out.println(paises.containsKey("BR"));
        System.out.println(paises.containsValue("Brasil"));
        System.out.println(paises.get("CN"));
        paises.remove("RU");
        System.out.println(paises);
        Set<String> keys = paises.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        
        
    }
}
