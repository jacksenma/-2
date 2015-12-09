package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.OrderInputService;
import blservice.transitsalmanblservice.TrafficMesManageService;
import businesslogic.courierbl.OrderInputImpl;
import businesslogic.courierbl.ReceiveMesImpl;
import businesslogic.expressbl.Expressbl;
import data.orderdata.OrderIO;
import dataservice.courierdataservice.CourierService;
import dataservice.transitmandataservice.TransitManService;
import po.transitmanpo.TrafficMespo;
import vo.couriervo.Datevo;
import vo.queryvo.Queryvo;
import vo.transitmanvo.TrafficMesManagevo;

public class TrafficMesManageImpl extends UnicastRemoteObject implements TrafficMesManageService {

	static ReceiveMesImpl rmi;
	
	static Expressbl eb;
	
	static TransitManService tms;
	
	public TrafficMesManageImpl() throws RemoteException {
		super();
		rmi = new ReceiveMesImpl();
		eb = new Expressbl();
		tms = new OrderIO();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getMes(TrafficMesManagevo tvo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			TrafficMespo tpo = new TrafficMespo(tvo);
			if(tms.TrafficOrderWrite(tpo)){
				for(int i = 0 ; i < tvo.allID.size() ; i++){
					tms.addHistory(tvo.allID.get(i), "货物已在中转中心 "
						+ tvo.begin	+ tpo.cenID + " 出发，目的地是"
							+ tvo.target + "，交通工具为" + tpo.tt);
				}
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean checkDate(Datevo d, TrafficMesManagevo tvo) throws RemoteException {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < tvo.allID.size() ; i++){
			if(!rmi.checkDateE(d, eb.checkOrder(new Queryvo(tvo.allID.get(i))))
					|| !rmi.checkDateL(d)){
				return false;
			}
		}
		return true;
	}


}
