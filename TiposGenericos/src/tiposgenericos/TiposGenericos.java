package tiposgenericos;

import java.util.ArrayList;

public class TiposGenericos <E> {
    private static int Double;
    
    E elemento;
    
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public E getElemento(){
        return elemento;
    }
    
    public double soma(ArrayList<? extends Number> lista){
        //PODERIA AO INVES DE extends, ==>> super
        double total = 0;
        for(Number numero : lista){
            total += numero.doubleValue();
        }
        return total;
    }
    
    public static void main(String[] args) {
        TiposGenericos<String> generico = new TiposGenericos<String>();
        generico.setElemento("Lago Paranoa");
        generico.getElemento().toUpperCase();
        
        ArrayList<Double> arrayDouble = new ArrayList<>();

    }
}
