package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.transitsalmanblservice.TrafficMesManageService;
import vo.couriervo.Datevo;
import vo.transitmanvo.TrafficMesManagevo;

public class TrafficMesManageImpl extends UnicastRemoteObject implements TrafficMesManageService {

	public TrafficMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getMes(TrafficMesManagevo tvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkDate(Datevo d, TrafficMesManagevo tvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}


}
