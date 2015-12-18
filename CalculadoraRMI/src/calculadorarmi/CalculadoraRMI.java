package calculadorarmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraRMI {

    public static void main(String[] args) {
        try{
            CalculadoraRemota objCalculadoraRemota = new CalculadoraRemotaImplemetada();
            //Registry registry = LocateRegistry.getRegistry();
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",1000);
            registry.rebind("CalculadoraRemotaImplemetada", objCalculadoraRemota);
            System.out.println("Soma: "+objCalculadoraRemota.adicao(10, 5));
            System.out.println("Multiplicacao: "+objCalculadoraRemota.multiplicacao(10, 5));
            System.out.println("Subtracao: "+objCalculadoraRemota.subtracao(10, 5));
            System.out.println("Divisao: "+objCalculadoraRemota.divisao(10, 5));
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
