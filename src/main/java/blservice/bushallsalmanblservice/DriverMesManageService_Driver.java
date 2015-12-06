package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.DriverMesManagevo;

public class DriverMesManageService_Driver {

	public void drive(DriverMesManageService driverMesManageService) throws RemoteException{
		//DriverMesManagevo information =DriverMesManagevo.getInformation();
		//driverMesManageService.inputdriver(information, null);
	}
	
	public static void main(String[] args) throws RemoteException{
		DriverMesManageService_Driver driver =new DriverMesManageService_Driver();
		DriverMesManageService_Stub stub=new DriverMesManageService_Stub();
		driver.drive(stub);
	}
}
