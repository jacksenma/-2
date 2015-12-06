package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;

public interface ReceiveSendService extends Remote {

	public boolean inputreceive(Receivevo receive)
			throws RemoteException;
	
	public boolean inputsend(Sendvo send)
			throws RemoteException;
}
