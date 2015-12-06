package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import vo.generalmanagervo.Constancyvo;

public interface ConstantFormulateService extends Remote {

	public Constancyvo showConstancy() throws RemoteException, Exception;
	
	public boolean modifyconstancy(Constancyvo cv)
			 throws RemoteException;
	
	public void addcity(String s)throws RemoteException;
	
	public List<String> getcity()throws RemoteException;
	
	public void deletecity(String s)throws RemoteException;
	
	public void modifycity(String oldc,String newc)throws RemoteException;
}
