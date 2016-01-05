package businesslogic.generalmanagerbl;

import dataservice.otherdataservice.FinanceService;
import vo.generalmanagervo.Accountvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.host.HostLog;
import blservice.generalmanagerblservice.AccountQueryService;

public class AccountQueryImpl extends UnicastRemoteObject implements AccountQueryService {
      
	public AccountQueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountvo showAccount(){
		FinanceService fs = new FinanceService();
		System.out.println("显示银行账户信息");
		 HostLog.addMes("总经理查询账户");
		return null;
	}
} 
