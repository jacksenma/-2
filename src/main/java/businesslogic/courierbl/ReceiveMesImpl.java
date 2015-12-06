package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import blservice.courierblservice.ReceiveMesService;
import data.orderdata.OrderIO;
import dataservice.courierdataservice.CourierService;
import po.courierpo.CourierOrderpo;
import po.courierpo.ReceiveOrderpo;
import vo.couriervo.Datevo;
import vo.couriervo.ReceiveMesvo;
import vo.queryvo.QueryOrdervo;

public class ReceiveMesImpl extends UnicastRemoteObject implements ReceiveMesService {

	static CourierService cs;
	
	public ReceiveMesImpl() throws RemoteException {
		super();
		cs = new OrderIO();
		// TODO Auto-generated constructor stub
	}

	public boolean getReceive(ReceiveMesvo r) throws RemoteException {
		// TODO Auto-generated method stub
		ReceiveOrderpo rpo = new ReceiveOrderpo(r.ID , r.receiver , r.date);
		
		return cs.writeReceive(rpo);
	}

	public boolean checkDateE(Datevo d, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		Date day = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String month;
		if(d.month < 10) month = "0" + d.month;
		else month = d.month + "";
		String inday;
		if(d.day < 10) inday = "0" + d.day;
		else inday = d.day + "";
		try {
			day = df.parse(d.year + "-" + month + "-" + inday + " 23:59");
			CourierOrderpo copo = cs.search(qvo.getID());
			Calendar cal = Calendar.getInstance();;
			cal.setTime(copo.date);
			Calendar cal1 = Calendar.getInstance();
			cal1.setTime(day);
			System.out.println(copo.date);
			if(cal.compareTo(cal1) < 0)
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkDateL(Datevo d) throws RemoteException {
		// TODO Auto-generated method stub
		Date day = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Calendar cal = Calendar.getInstance();
		cal.setTime(day);
		String month;
		if(d.month < 10) month = "0" + d.month;
		else month = d.month + "";
		String inday;
		if(d.day < 10) inday = "0" + d.day;
		else inday = d.day + "";
		try {
			Date d1 = df.parse(d.year + "-" + month + "-" + inday + " 00:00");
			Calendar cal1 = Calendar.getInstance();
			cal1.setTime(d1);
			if(cal.compareTo(cal1) >= 0){
				return true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
