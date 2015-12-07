package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarLoadingvo;
import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;

public class CarLoadingService_Stub implements CarLoadingService{

	CarLoadingvo information=CarLoadingvo.getInformation();

	public boolean inputLoad(CarLoadingvo information) {
		// TODO Auto-generated method stub
		System.out.println("进行车辆装车管理");
		return false;
	}

	public boolean checkDate(CarLoadingvo clvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkDate(CarLoadingvo clvo, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public boolean modifyCarLoading(CarLoadingvo cv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CarLoadingvo showInputLoad(String car) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
