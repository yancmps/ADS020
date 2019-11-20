import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public interface CalculadoraRemota extends Remote{
    
    
    public int somar(int a, int b) throws RemoteException;
    public int subtrair(int a, int b) throws RemoteException;
    public int multiplicar(int a, int b) throws RemoteException;
    public int dividir(int a, int b) throws RemoteException;
    
}