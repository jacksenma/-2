package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public interface CarMesManageService extends Remote{

	//车辆信息输入
	public boolean inputVehicle(CarMesManagevo information) throws RemoteException;
}
