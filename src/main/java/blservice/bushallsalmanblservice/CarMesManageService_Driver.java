package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarMesManagevo;

public class CarMesManageService_Driver {

	public void drive(CarMesManageService carMesManageService) throws RemoteException{
		CarMesManagevo information =CarMesManagevo.getInformation();
		carMesManageService.inputVehicle(information);
	}
	
	public static void main(String[] args) throws RemoteException{
		CarMesManageService_Driver driver =new CarMesManageService_Driver();
		CarMesManageService_Stub stub = new CarMesManageService_Stub();
		driver.drive(stub);
	}
}
