package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.OrderInputService;
import data.orderdata.OrderIO;
import dataservice.courierdataservice.CourierService;
import po.courierpo.CourierOrderpo;
import vo.couriervo.GoodsMesvo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.Personvo;
import vo.couriervo.PriceAndTimevo;

public class OrderInputImpl extends UnicastRemoteObject implements OrderInputService {

	CourierService cs;
	
	public OrderInputImpl() throws RemoteException {
		super();
		cs = new OrderIO();
		// TODO Auto-generated constructor stub
	}

	public boolean getOrder(OrderInputvo o, PriceAndTimevo p) {
		// TODO Auto-generated method stub
            System.out.println(o.sender.name + o.sender.address + 
            		o.sender.company);
            try {
				if(cs.writeOrder(new CourierOrderpo(o, p)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	public boolean hasNull(Personvo p) throws RemoteException {
		// TODO Auto-generated method stub
		if(p.address.equals("") || p.company.equals("") || p.name.equals("") ||
				p.phone.equals("") || p.telephone.equals(""))
			return true;
		return false;
	}

	public boolean hasNegative(GoodsMesvo g) throws RemoteException {
		// TODO Auto-generated method stub
		if(g.number_of_goods < 1 || g.volume <= 0 || g.weight <= 0)
			return true;
		return false;
	}

	public boolean writeHistory(String ID , String history){
		try {
			return cs.addHistory(ID , history);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
