package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.PriceAndTimevo;

public interface PriceQueryService extends Remote {
	
	PriceAndTimevo getPriceAndTime(PriceAndTimevo p) throws RemoteException;

}
