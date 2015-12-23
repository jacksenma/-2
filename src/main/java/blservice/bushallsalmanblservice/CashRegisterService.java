package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.queryvo.QueryOrdervo;

public interface CashRegisterService extends Remote {

	//收款单输入
	public boolean inputcash(CashRegistervo information)
			throws RemoteException;

	//日期输入检验
	public boolean checkDate(CashRegistervo cashRegister, QueryOrdervo qovo)
			throws RemoteException;
	
	//显示收款单
	public CashRegistervo showCash(String iD2) throws RemoteException;
	
	//修改收款单
	boolean modifyCash(CashRegistervo cashRegister) throws RemoteException;
}
