package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CashRegisterService;
import blservice.courierblservice.ReceiveMesService;
import businesslogic.courierbl.ReceiveMesImpl;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CarLoadingvo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.couriervo.Datevo;
import vo.queryvo.QueryOrdervo;

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

	@Override
	public boolean checkDate(CashRegistervo crvo, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
        ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(crvo.date, qvo) && rms.checkDateL(crvo.date);
		
	}

	@Override
	public CashRegistervo showCash(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		CashReceiveOrderpo crpo = bss.getCash(ID);
		if(crpo==null){
			Datevo d=new Datevo(0,0,0);
			return new CashRegistervo(d, "0","0", "0", "0",
					"0");
		}
		else return crpo.getCash();
	
	}

	@Override
	public boolean modifyCash(CashRegistervo cr) throws RemoteException {
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
