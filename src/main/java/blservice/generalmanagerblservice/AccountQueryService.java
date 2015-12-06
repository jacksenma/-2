package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.Accountvo;

public interface AccountQueryService extends Remote {

	public Accountvo showAccount() throws RemoteException;

}
