package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CarMesManageService;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public class CarMesManageImpl extends UnicastRemoteObject implements CarMesManageService {

	public CarMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inputVehicle(CarMesManagevo cm) {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writeCarMes(new CarMespo(cm)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
