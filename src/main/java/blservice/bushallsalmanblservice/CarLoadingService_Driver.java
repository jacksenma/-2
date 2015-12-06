package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarLoadingvo;

public class CarLoadingService_Driver {

	public void drive(CarLoadingService carLoadingService) throws RemoteException{
		CarLoadingvo information=CarLoadingvo.getInformation();
		carLoadingService.inputLoad(information);
	}
	
		public static void main(String[] args) throws RemoteException{
			CarLoadingService_Driver driver = new CarLoadingService_Driver();
			CarLoadingService_Stub stub = new CarLoadingService_Stub();
			driver.drive(stub);
		}
	}

