package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.InitMesvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;

public interface AccountManageService extends Remote {
//	public AccountManagevo showAccount() throws RemoteException;
//	
//	public AccountManagevo addAcount(String name) throws RemoteException;
//	
//	public boolean deleteAccount() throws RemoteException;
	
//	public AccountManagevo changeAccount(String  name) throws RemoteException;
	
//	public AccountManagevo Initialize(String jigou,ArrayList<String> renyuan,
//			ArrayList<String> cheliang,int kucun,String accountname,int money)
//					 throws RemoteException;

	public boolean getOrder(AccountManagevo amvo) throws RemoteException;

	public boolean getOrder(InitMesvo ivo) throws RemoteException;

	public AccountUservo findUsers(AccountMesvo qvo)throws RemoteException;

	public AccountManagevo[] searchAll() throws RemoteException;
	public AccountManagevo[] searchAllInitAccount()throws RemoteException;
	public Institutionvo[] searchAllInitJigou()throws RemoteException;
	public Staffvo[] searchAllInitRenyuan()throws RemoteException;

	public RecieveListvo[] searchRe(String text) throws RemoteException;

	public PaymentInputvo[] searchPay(String text) throws RemoteException;

	public AccountManagevo[] searchMo(String text) throws RemoteException;

	public boolean deleteAccount(String name) throws RemoteException;

	public void init() throws RemoteException;

	

	public int getZong(int parseInt, String[] jqPay, String[] jqRe, int jqRecount, int jqPaycount) throws RemoteException;

	public boolean writeInitAccount()throws RemoteException;

	public boolean writeInitJigou()throws RemoteException;

	public boolean writeInitRenyuan()throws RemoteException;

	public boolean writeInitKucun()throws RemoteException;

	public boolean writeInitCheliang()throws RemoteException;

	

	

	

	

	

	
	
}
