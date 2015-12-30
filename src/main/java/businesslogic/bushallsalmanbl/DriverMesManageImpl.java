package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.host.HostLog;
import blservice.bushallsalmanblservice.DriverMesManageService;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.DriverMespo;
import vo.bushallsalmanvo.DriverMesManagevo;
import vo.bushallsalmanvo.Othervo2;

public class DriverMesManageImpl extends UnicastRemoteObject implements DriverMesManageService {

	public DriverMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inputdriver(DriverMesManagevo dm) {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writeDriverMes(new DriverMespo(dm))){
				HostLog.addMes("司机信息管理;"+"\n");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
