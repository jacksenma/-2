package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.bushallsalmanvo.CarMesManagevo;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.InitMesvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;
import vo.stocmanagermanvo.WarehouseWarningvo;

public interface AccountManageService extends Remote {


	public boolean getOrder(AccountManagevo amvo) throws RemoteException;

	public boolean getOrder(InitMesvo ivo) throws RemoteException;

	public AccountUservo findUsers(AccountMesvo qvo)throws RemoteException;
	
	public AccountManagevo[] searchAll() throws RemoteException;
	
	public RecieveListvo[] searchRe(String text) throws RemoteException;

	public PaymentInputvo[] searchPay(String text) throws RemoteException;

	public AccountManagevo[] searchMo(String text) throws RemoteException;

	public boolean deleteAccount(String name) throws RemoteException;

	public void init() throws RemoteException;

	public int getZong(int parseInt, String[] jqPay, String[] jqRe, int jqRecount, int jqPaycount) throws RemoteException;
	
	
	
	public AccountManagevo[] searchAllInitAccount()throws RemoteException;
	
	public Institutionvo[] searchAllInitJigou()throws RemoteException;
	
	public Staffvo[] searchAllInitRenyuan()throws RemoteException;
	
	public CarMesManagevo[] searchAllInitCheliang()throws RemoteException;
	
	public WarehouseWarningvo[] searchAllInitKucun()throws RemoteException;

	public boolean writeInitAccount()throws RemoteException;

	public boolean writeInitJigou()throws RemoteException;

	public boolean writeInitRenyuan()throws RemoteException;

	public boolean writeInitKucun()throws RemoteException;

	public boolean writeInitCheliang()throws RemoteException;
	

	

	

	

	

	

	

	

	
	
}
