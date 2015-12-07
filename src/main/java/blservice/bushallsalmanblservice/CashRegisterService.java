package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.queryvo.QueryOrdervo;

public interface CashRegisterService extends Remote {

	public boolean inputcash(CashRegistervo information)
			throws RemoteException;

	public boolean checkDate(CashRegistervo cashRegister, QueryOrdervo qovo)
			throws RemoteException;
	
	public CashRegistervo showCash(String iD2) throws RemoteException;
	
	boolean modifyCash(CashRegistervo cashRegister) throws RemoteException;
}
