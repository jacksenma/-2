package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.PriceQueryService;
import data.orderdata.OrderIO;
import dataservice.courierdataservice.CourierService;
import po.courierpo.PriceAndTimepo;
import vo.couriervo.Datevo;
import vo.couriervo.PriceAndTimevo;

public class PriceQueryImpl extends UnicastRemoteObject implements PriceQueryService {

	public PriceQueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceAndTimevo getPriceAndTime(PriceAndTimevo p) throws RemoteException {
		// TODO Auto-generated method stub
		PriceAndTimepo ptpo = new PriceAndTimepo(p);
		CourierService cs = new OrderIO();
		ptpo = cs.query(ptpo);
		p.price = ptpo.price;
        p.date = new Datevo();
		return p;
	}

}
