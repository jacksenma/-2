package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarLoadingvo;

public interface CarLoadingService extends Remote {

	public boolean inputLoad(CarLoadingvo information)  throws RemoteException;
}
