package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.transitsalmanblservice.TrafficMesManageService;
import vo.transitmanvo.TrafficMesManagevo;

public class TrafficMesManageImpl extends UnicastRemoteObject implements TrafficMesManageService {

	public TrafficMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrafficMesManagevo getMes() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
