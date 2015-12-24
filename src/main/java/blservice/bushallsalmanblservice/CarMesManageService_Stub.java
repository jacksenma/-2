package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public class CarMesManageService_Stub implements CarMesManageService{

	public boolean inputVehicle(CarMesManagevo information) {
		// TODO Auto-generated method stub
		System.out.println("进行车辆信息管理");
		return true;
	}

	@Override
	public boolean AllSearch(String string) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}