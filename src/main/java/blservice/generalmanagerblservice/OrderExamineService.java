package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

public interface OrderExamineService extends Remote {

	public OrderExaminevo showOrders() throws RemoteException;
	
	public void approveexpressorder(String ID) throws RemoteException;
	public void approvecarloadingorde(String ID) throws RemoteException;
	public void approveyingyetingorder(String ID) throws RemoteException;
	public void approvecarshoukuanorder(String ID) throws RemoteException;
	public void approvezhongzhuanorder(String ID) throws RemoteException;
	public void approvepaijianorder(String ID) throws RemoteException;
	public void approvezhongzhuanzhongxinorder(String ID) throws RemoteException;
	public void approveinstockorder(String ID) throws RemoteException;
	public void approveoutstockorder(String ID) throws RemoteException;
	public void approvepaymentorder(String ID) throws RemoteException;
	
	public void disapprove(String ID)
	        throws RemoteException;
	
	public String[] showexpressorder() throws RemoteException;
	public String[] showcarloadingorder() throws RemoteException;
	public String[] showyingyetingorder() throws RemoteException;
	public String[] showshoukuanorder() throws RemoteException;
	public String[] showzhongzhuanorder() throws RemoteException;
	public String[] showpaijianorder() throws RemoteException;
	public String[] showzhongzhuanzhongxinorder() throws RemoteException;
	public String[] showinstockorder() throws RemoteException;
	public String[] showoutstockorder() throws RemoteException;
	public String[] showpaymentorder() throws RemoteException;
}
