package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

public class AccountQueryService_driver {

	public void drive(AccountQueryService stub) throws RemoteException {
		// TODO Auto-generated method stub	
		 stub.showAccount();
	}

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		AccountQueryService_driver d = new AccountQueryService_driver();
		AccountQueryService  stub = new AccountQueryService_Stub();
		d.drive(stub);
	}

}
