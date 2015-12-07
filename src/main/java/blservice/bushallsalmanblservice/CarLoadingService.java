package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarLoadingvo;
import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;
import vo.transitmanvo.TransitReceivevo;

public interface CarLoadingService extends Remote {

	public boolean inputLoad(CarLoadingvo information)  throws RemoteException;
	
	boolean checkDate(CarLoadingvo clvo,QueryOrdervo qvo) throws RemoteException;
	
	CarLoadingvo showInputLoad() throws RemoteException;


	boolean modifyCarLoading(CarLoadingvo cv) throws RemoteException;

	
}
