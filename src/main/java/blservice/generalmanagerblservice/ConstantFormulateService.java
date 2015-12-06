package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.Constancyvo;

public interface ConstantFormulateService extends Remote {

	public Constancyvo showConstancy() throws RemoteException, Exception;
	
	public boolean modifyconstancy(Constancyvo cv)
			 throws RemoteException;
}
