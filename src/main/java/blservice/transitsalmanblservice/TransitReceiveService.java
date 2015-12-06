package blservice.transitsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.queryvo.QueryOrdervo;
import vo.transitmanvo.TransitReceivevo;

public interface TransitReceiveService extends Remote {
	
	boolean getReceive(TransitReceivevo t) throws RemoteException;

	boolean checkDate(TransitReceivevo t , QueryOrdervo qvo) throws RemoteException;
}
