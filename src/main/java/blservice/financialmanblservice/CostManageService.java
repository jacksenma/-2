package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.JTextField;

import vo.financialmanvo.CheckPaymentListvo;
import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.Recordvo;

public interface CostManageService extends Remote {
//	public CostManagevo show(String date,int numOfBusHall) throws RemoteException;
//	
//	public CostManagevo jisuan() throws RemoteException;
//	
//	public CostManagevo xinjian(int date,int money, 
//			String person,String address,String tiaomu)
//					 throws RemoteException;
//	
//	public boolean daochu() throws RemoteException;
	public boolean getOrder(PaymentInputvo pivo) throws RemoteException;
	
//	public CostManagevo profit() throws RemoteException;
//	boolean hasNegative(Moneyvo g) throws RemoteException;

	public RecieveListvo[] SearchByMes(String text, String text2, String text3, String text4)
			throws RemoteException;
	
	public void delete(String number) throws RemoteException;

	public CheckPaymentListvo SearchP(String number) throws RemoteException;//用于审批的查找付款单

	public boolean record(Recordvo rvo)throws RemoteException;

	public Recordvo[] AllRecordSearch() throws RemoteException;

	public int getSum(String[] ss, int count)throws RemoteException;

	public int[] getIncome(String[] ss, String[] sp, int count, int chu)throws RemoteException;

	public void daochu(String year,String month,String day,String idd, String shouru, String zhichu1, String lirun, int i)throws RemoteException;

	public boolean checkYyt(String yytID)throws RemoteException;

	
	
}

