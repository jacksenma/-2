package RMI.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Test extends Remote {
	
	String print() throws RemoteException;
	
	String print(String s) throws RemoteException;

}
