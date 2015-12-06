package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.Datevo;
import vo.couriervo.ReceiveMesvo;
import vo.queryvo.QueryOrdervo;

public interface ReceiveMesService extends Remote {
	
	public boolean getReceive(ReceiveMesvo r) throws RemoteException;
	
	public boolean checkDateE(Datevo d, QueryOrdervo qvo) throws RemoteException;
	
	
	public boolean checkDateL(Datevo d) throws RemoteException;

}
