package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CarLoadingService;
import blservice.courierblservice.ReceiveMesService;
import businesslogic.courierbl.ReceiveMesImpl;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.courierpo.CourierOrderpo;
import vo.bushallsalmanvo.CarLoadingvo;
import vo.queryvo.QueryOrdervo;

public class CarLoadingImpl extends UnicastRemoteObject implements CarLoadingService {

	public CarLoadingImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inputLoad(CarLoadingvo cl) {
		//System.out.println("**************************888");
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writeCarloading(new CarLoadingpo(cl)))
				return true;
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

}
