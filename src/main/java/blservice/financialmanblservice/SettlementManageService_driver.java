package blservice.financialmanblservice;

import java.rmi.RemoteException;

public class SettlementManageService_driver {
	public void driver(SettlementManageService stub) throws RemoteException{
//		stub.shuRu(null, null, null, null, 0, null);
//		stub.baocun();
//		
		
		
	}
	public static void main(String[] args) throws RemoteException {
		SettlementManageService_driver d=new SettlementManageService_driver();
		SettlementManageService stub=new SettlementManageService_Stub();
		d.driver(stub);
	}
}
