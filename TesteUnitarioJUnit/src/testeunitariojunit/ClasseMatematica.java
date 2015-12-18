package testeunitariojunit;

public class ClasseMatematica {
    
    public int maior(int numero1, int numero2){
        if(numero1 > numero2){
            return numero1;
        }else{
            return numero2;
        }
    }
    
    public int soma(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public int raiz(int numero){
        //SO PRA NUMERO CUJA RAIZ E FRACIONADA
        int raiz = 0; int impar = 1;
        while(numero > impar){
            numero -= impar;
            impar += 2; raiz++;
        }
        return raiz;
    }
    
    double soma(String titulo, double ... numeros){
        double total = 0;
        for(double numero : numeros){
            total += numero;
        }
        return total;
    }
}
