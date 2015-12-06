package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.ReceiveMesService;
import blservice.transitsalmanblservice.TransitReceiveService;
import businesslogic.courierbl.ReceiveMesImpl;
import data.orderdata.OrderIO;
import dataservice.transitmandataservice.TransitManService;
import po.transitmanpo.TransitReceiveOrderpo;
import vo.queryvo.QueryOrdervo;
import vo.transitmanvo.TransitReceivevo;

public class TransitReceiveImpl extends UnicastRemoteObject implements TransitReceiveService {

	public TransitReceiveImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean getReceive(TransitReceivevo t) throws RemoteException {
		// TODO Auto-generated method stub
		TransitManService tms = new OrderIO();
		TransitReceiveOrderpo po = new TransitReceiveOrderpo
				(t.cenID , t.date , t.ID , t.start , t.type);
		try {
			if(!tms.receiveOrderWrite(po)) return false;
			else {
				tms.addHistory(t.ID, "货物已在中转中心 " + t.cenID + " 接收。");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkDate(TransitReceivevo t, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(t.date, qvo) && rms.checkDateL(t.date);
	}

}
