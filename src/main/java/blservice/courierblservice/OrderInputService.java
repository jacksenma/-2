package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.GoodsMesvo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.Personvo;
import vo.couriervo.PriceAndTimevo;

public interface OrderInputService extends Remote {

	public boolean getOrder(OrderInputvo o, PriceAndTimevo p) throws RemoteException;
	
	boolean hasNull(Personvo p) throws RemoteException;
	
	boolean hasNegative(GoodsMesvo g) throws RemoteException;
}