package calculadorarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraRemota extends Remote{
    public int adicao(int a, int b) throws RemoteException;
    public int multiplicacao(int a, int b) throws RemoteException;
    public double subtracao(int a, int b) throws RemoteException;
    public double divisao(int a, int b) throws RemoteException;
}
