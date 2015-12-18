package testeunitariojunit;

public class MatematicaRaizPell {

    public static void main(String[] args) {
        ClasseMatematica matematica = new ClasseMatematica();
        System.out.println(matematica.soma(10, 5));
        System.out.println(matematica.maior(10, 5));
        System.out.println(matematica.raiz(16));
        System.out.println(Math.sqrt(276));
        
        System.out.println(matematica.soma("Calculo",10, 5, 5, 3, 9));
    }
}
