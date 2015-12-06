package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.InitMesvo;

public interface AccountManageService extends Remote {
	public AccountManagevo showAccount() throws RemoteException;
	
	public AccountManagevo addAcount(String name) throws RemoteException;
	
	public boolean deleteAccount() throws RemoteException;
	
	public AccountManagevo changeAccount(String  name) throws RemoteException;
	
	public AccountManagevo Initialize(String jigou,ArrayList<String> renyuan,
			ArrayList<String> cheliang,int kucun,String accountname,int money)
					 throws RemoteException;

	public boolean getOrder(AccountManagevo amvo) throws RemoteException;

	public boolean getOrder(InitMesvo ivo) throws RemoteException;
	
}
