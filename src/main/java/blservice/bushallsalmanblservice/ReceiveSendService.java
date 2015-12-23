package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;
import vo.queryvo.QueryOrdervo;

public interface ReceiveSendService extends Remote {

	//接收单输入
	public boolean inputreceive(Receivevo receive)
			throws RemoteException;
	
	//派件单输入
	public boolean inputsend(Sendvo send)
			throws RemoteException;

	//收件单日期输入检验
	public boolean checkDate(Receivevo1 receive1, QueryOrdervo qovo)
	        throws RemoteException;

	//派件单日期输入检验
	public boolean checkDate(Sendvo send, QueryOrdervo qovo)
	        throws RemoteException;

	//显示收件单信息
	public Receivevo showReceive(String iD)
	        throws RemoteException;

	//修改收件单信息
	public boolean modifyReceive(Receivevo receive)
	        throws RemoteException;

	//显示派件单信息
	public Sendvo showSend(String iD)
	        throws RemoteException;

	//修改派件单信息
	public boolean modifySend(Sendvo sendvo)
	        throws RemoteException;
}
