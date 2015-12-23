package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public interface CarMesManageService extends Remote{

	public boolean inputVehicle(CarMesManagevo information) throws RemoteException;
}
