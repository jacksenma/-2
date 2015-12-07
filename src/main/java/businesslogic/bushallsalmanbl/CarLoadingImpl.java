package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CarLoadingService;
import blservice.courierblservice.ReceiveMesService;
import businesslogic.courierbl.OrderInputImpl;
import businesslogic.courierbl.ReceiveMesImpl;
import data.constancydata.Constancy;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import dataservice.generalmanagerdataservice.GeneralManagerService;
import po.bushallsalmanpo.CarLoadingpo;
import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Constancypo;
import vo.bushallsalmanvo.CarLoadingvo;
import vo.couriervo.Datevo;
import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;

public class CarLoadingImpl extends UnicastRemoteObject implements CarLoadingService {

	public CarLoadingImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inputLoad(CarLoadingvo cl) throws RemoteException {
		//System.out.println("**************************888");
		BushallsalmanService bss = new BusinessHall();
		OrderInputImpl ois = new OrderInputImpl();
		try {
			if(bss.writeCarloading(new CarLoadingpo(cl))){
				ois.writeHistory(cl.tuoYunDan, "已在"+cl.yingYeTing+"装车");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkDate(CarLoadingvo clvo,QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
        ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(clvo.date, qvo) && rms.checkDateL(clvo.date);
		
	}

	@Override
	public CarLoadingvo showInputLoad(String car) throws RemoteException {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		CarLoadingpo cpo=bss.getLoad(car);
		if(cpo==null){
			Datevo d=new Datevo(0,0,0);
			return new CarLoadingvo(d, "0","0", "0", "0",
					"0", "0", "0", "0");
		}
		else return cpo.getload();
	}

	@Override
	public boolean modifyCarLoading(CarLoadingvo cv) throws RemoteException{
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writeCarloading(new CarLoadingpo(cv)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
}
