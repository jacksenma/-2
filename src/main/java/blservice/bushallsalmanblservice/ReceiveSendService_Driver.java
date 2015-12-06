package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;

public class ReceiveSendService_Driver {

	public void drive(ReceiveSendService receiveSendService) throws RemoteException{
		//Receivevo1 receiveInformation =Receivevo1.getReceiveInformation();
		//Sendvo sendInformation = Receivevo1.getSendInformation();
		//receiveSendService.inputreceive(receiveInformation);
		//receiveSendService.inputsend(sendInformation);
	}
	
	public static void main(String[] args) throws RemoteException{
		ReceiveSendService_Driver driver = new ReceiveSendService_Driver();
		ReceiveSendService_Stub stub = new ReceiveSendService_Stub();
		driver.drive(stub);
	}
}
