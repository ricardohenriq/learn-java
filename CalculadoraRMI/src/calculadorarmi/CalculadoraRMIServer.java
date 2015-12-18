package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraRMIServer {
    
    public static void main(String[] args) throws RemoteException {
        try{
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("CalculadoraRemotaImplemetada", new CalculadoraRemotaImplemetada());
            System.out.println("Servidor Iniciado");
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }  
    }
}
