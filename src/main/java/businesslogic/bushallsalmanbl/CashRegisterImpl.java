package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CashRegisterService;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public class CashRegisterImpl extends UnicastRemoteObject implements CashRegisterService {

	public CashRegisterImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inputcash(CashRegistervo cr) {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writecash(new CashReceiveOrderpo(cr)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
