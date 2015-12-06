package blservice.financialmanblservice;

import java.rmi.RemoteException;

public class CostManageService_driver {
	public void driver(CostManageService stub) throws RemoteException{
		stub.show(null, 5);
		stub.jisuan();
		stub.xinjian(0, 0, null, null, null);
		stub.profit();
		stub.daochu();
	}
	public static void main(String[] args) throws RemoteException {
		CostManageService_driver d=new CostManageService_driver();
		CostManageService stub=new CostManageService_Stub();
		d.driver(stub);
	}
}
