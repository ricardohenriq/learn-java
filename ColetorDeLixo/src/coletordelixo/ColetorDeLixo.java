package coletordelixo;

import java.util.ArrayList;
import java.util.List;

public class ColetorDeLixo {
    
    public static long carregarMemoria(){
        List<Integer> lista = new ArrayList<>();
        for(int i = 0;i < 100000;i++){
            lista.add(i);
        }
        return Runtime.getRuntime().freeMemory();
    }
    
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        //TOTAL DE MEMORIA DISPONIVEL PARA JVM
        System.out.println(rt.maxMemory()/1048576+" MB");
        //QUANTO DE MEMORIA FOI UTILIZADA
        System.out.println(((rt.maxMemory() - carregarMemoria())/1048576)+" MB");
        rt.runFinalization();
        rt.gc();
        System.out.println((rt.freeMemory()/1048576)+" MB");
    }
}
