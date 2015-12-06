package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

public class StaffInstitutionManagerService_driver {
       String name = "";
       String leader = " ";
	public void drive (StaffInstitutionManagerService stub) throws RemoteException{
}
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		StaffInstitutionManagerService_driver d = new StaffInstitutionManagerService_driver();
		StaffInstitutionManagerService stub = new StaffInstitutionManagerService_Stub();
		d.drive(stub);
	}

}
