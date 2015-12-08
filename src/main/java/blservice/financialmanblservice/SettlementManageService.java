package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financialmanpo.IncomeInputpo;
import vo.financialmanvo.IncomeInputvo;
import vo.financialmanvo.SettlementManagevo;

public interface SettlementManageService extends Remote{
//	public SettlementManagevo shuRu(String da,String danw,
//			String pers,String shou,int mon,String add)
//					 throws RemoteException;
//	
//	public void baocun() throws RemoteException;

	public boolean getOrder2(IncomeInputvo iivo)throws RemoteException;

//	public boolean writeOrder2(IncomeInputpo incomeInputpo)throws RemoteException, Exception;
}
