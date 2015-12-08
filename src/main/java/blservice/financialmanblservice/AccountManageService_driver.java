package blservice.financialmanblservice;

import java.rmi.RemoteException;

public class AccountManageService_driver {
	public void drive(AccountManageService stub) throws RemoteException{
//		stub.addAcount("wuliu");
//		stub.changeAccount("st");
//		stub.deleteAccount();
//		stub.Initialize(null, null, null, 0, null, 0);
//		stub.showAccount();
		
	}
	public static void main(String[] args) throws RemoteException {
		AccountManageService_driver d=new AccountManageService_driver();
		AccountManageService stub=new AccountManageService_Stub();
		d.drive(stub);
	}
}
