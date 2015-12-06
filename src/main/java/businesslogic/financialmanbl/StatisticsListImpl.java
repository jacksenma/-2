package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.StatisticsListService;
import vo.financialmanvo.StatisticsListvo;

public class StatisticsListImpl extends UnicastRemoteObject implements StatisticsListService {

	public StatisticsListImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatisticsListvo date(String date1, String Date2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean daochu() {
		// TODO Auto-generated method stub
		return false;
	}

}
