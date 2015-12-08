package blservice.transitsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.Datevo;
import vo.transitmanvo.TrafficMesManagevo;

public interface TrafficMesManageService extends Remote {
	
	boolean getMes(TrafficMesManagevo tvo) throws RemoteException;

	boolean checkDate(Datevo d , TrafficMesManagevo tvo) throws RemoteException;
}
