package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.queryvo.QueryOrdervo;

public class CashRegisterService_Stub implements CashRegisterService{

	public boolean inputcash(CashRegistervo information) {
		// TODO Auto-generated method stub
		System.out.println("生成收款单");
		return true;
	}

	@Override
	public boolean checkDate(CashRegistervo cashRegister, QueryOrdervo qovo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CashRegistervo showCash() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyCash(CashRegistervo cashRegister) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	
}
