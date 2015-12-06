package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

public class SalaryFormulateService_driver {
	
	public void drive(SalaryFormulateService stub) throws RemoteException{
		stub.showSalary();
	}
	public static void main(String[] args) throws RemoteException {
		
		SalaryFormulateService_driver d = new SalaryFormulateService_driver();
		SalaryFormulateService stub = new SalaryFormulateService_Stub();
		d.drive(stub);
		// TODO Auto-generated method stub

	}

}
