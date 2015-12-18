package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraRemotaImplemetada extends UnicastRemoteObject implements CalculadoraRemota{
    
    //Construtor padrao
    public CalculadoraRemotaImplemetada() throws RemoteException{};
    
    @Override
    public int adicao(int a, int b) throws RemoteException {
        return (a + b);
    }

    @Override
    public int multiplicacao(int a, int b) throws RemoteException {
        return (a * b);
    }

    @Override
    public double subtracao(int a, int b) throws RemoteException {
        return (a - b);
    }

    @Override
    public double divisao(int a, int b) throws RemoteException {
        return (a / b);
    }
    
}
