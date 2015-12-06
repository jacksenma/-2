package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.financialmanvo.StatisticsListvo;

public interface StatisticsListService extends Remote {
	public StatisticsListvo date(String date1,String Date2) throws RemoteException;
	
	public boolean daochu() throws RemoteException;
}
