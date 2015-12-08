package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.StatisticsListvo;

public interface StatisticsListService extends Remote {
//	public StatisticsListvo date(String date1,String Date2) throws RemoteException;
//	
//	public boolean daochu() throws RemoteException;
	public RecieveListvo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException;

	public PaymentInputvo[] SearchPay(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException;

}
