package blservice.financialmanblservice;

import java.rmi.RemoteException;

public class StatisticsListService_driver {
	public void driver(StatisticsListService stub) throws RemoteException{
//		stub.date(null, null);
//		stub.daochu();
//		
		
		
		
	}
	public static void main(String[] args) throws RemoteException {
		StatisticsListService_driver d=new StatisticsListService_driver();
		StatisticsListService stub=new StatisticsListService_Stub();
		d.driver(stub);
	}
}
