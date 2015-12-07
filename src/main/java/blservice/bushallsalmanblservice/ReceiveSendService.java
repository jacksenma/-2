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

	public boolean inputreceive(Receivevo receive)
			throws RemoteException;
	
	public boolean inputsend(Sendvo send)
			throws RemoteException;

	public boolean checkDate(Receivevo1 receive1, QueryOrdervo qovo)
	        throws RemoteException;

	public boolean checkDate(Sendvo send, QueryOrdervo qovo)
	        throws RemoteException;

	public Receivevo showReceive()
	        throws RemoteException;

	public boolean modifyReceive(Receivevo receive)
	        throws RemoteException;

	public Sendvo showSend()
	        throws RemoteException;

	public boolean modifySend(Sendvo sendvo)
	        throws RemoteException;
}
