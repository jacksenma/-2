package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;
import vo.queryvo.QueryOrdervo;

public class ReceiveSendService_Stub implements ReceiveSendService{

	public boolean inputreceive(Receivevo receiveInformation) {
		// TODO Auto-generated method stub
		System.out.println("生成收件单");
		return true;
	}

	public SendOrderpo inputsend(Receivevo1 sendInformation) {
		// TODO Auto-generated method stub
		System.out.println("生成派件单");
		return null;
	}

	public boolean inputsend(Sendvo send) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkDate(Receivevo1 receive1, QueryOrdervo qovo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkDate(Sendvo send, QueryOrdervo qovo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Receivevo showReceive() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyReceive(Receivevo receive) throws RemoteException {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sendvo showSend() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifySend(Sendvo sendvo) throws RemoteException {
		return false;
		// TODO Auto-generated method stub
		
	}

}
