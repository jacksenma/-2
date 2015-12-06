package blservice.transitsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.transitmanvo.TrafficMesManagevo;

public interface TrafficMesManageService extends Remote {
	
	TrafficMesManagevo getMes() throws RemoteException;

}
