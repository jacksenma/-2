package businesslogic.expressbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.queryblservice.QueryService;
import data.orderdata.OrderIO;
import dataservice.otherdataservice.ExpressService;
import po.courierpo.CourierOrderpo;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

public class Expressbl extends UnicastRemoteObject implements QueryService {

    public Expressbl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryOrdervo checkOrder(Queryvo qvo) {
         //To change body of generated methods, choose Tools | Templates.
        ExpressService es = new OrderIO();
        CourierOrderpo co;
		try {
			co = es.search(qvo.getID());
			if(co == null) return null;
	        return new QueryOrdervo(co);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public boolean isValid(String s) {
        //To change body of generated methods, choose Tools | Templates.
        return s.length() == 10;
    }

}