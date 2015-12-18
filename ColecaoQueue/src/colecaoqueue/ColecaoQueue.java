package colecaoqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Camaro");
        fila.add("Mustang");
        fila.offer("Charger");
        System.out.println(fila);
        System.out.println(fila.peek());//MOSTRA O PRIMEIRO
        System.out.println(fila.poll());//REMOVE O PRIMEIRO
        System.out.println(fila);
        
        //OUTROS METODOS DISPONIVEIS EM linkedlist
        LinkedList<String> fila2 = (LinkedList<String>) fila;
        fila2.addFirst("Ferrari");
        System.out.println(fila2);
        fila2.addLast("Carroca");
        System.out.println(fila2);
        System.out.println(fila2.peekFirst());
        System.out.println(fila2.peekLast());
        fila2.pollFirst();
        fila2.pollLast();
        System.out.println(fila2);
    }
}
