package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.ReceiveSendService;
import blservice.courierblservice.ReceiveMesService;
import businesslogic.courierbl.ReceiveMesImpl;
import data.institutiondata.BusinessHall;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;
import vo.queryvo.QueryOrdervo;

public class ReceiveSendImpl extends UnicastRemoteObject implements ReceiveSendService {

	public ReceiveSendImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public boolean inputreceive(Receivevo re) throws RemoteException {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writereceive(new ReceiveOrderpo(re)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}



	public boolean inputsend(Sendvo send) throws RemoteException {
		// TODO Auto-generated method stub
		BushallsalmanService bss = new BusinessHall();
		try {
			if(bss.writesend(new SendOrderpo(send)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}




	@Override
	public boolean checkDate(Receivevo1 receive1, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
        ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(receive1.date, qvo) && rms.checkDateL(receive1.date);
	}




	@Override
	public boolean checkDate(Sendvo send, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
        ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(send.date, qvo) && rms.checkDateL(send.date);
	}

}
