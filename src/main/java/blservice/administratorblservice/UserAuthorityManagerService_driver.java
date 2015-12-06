package blservice.administratorblservice;

import java.rmi.RemoteException;

public class UserAuthorityManagerService_driver {
	public void drive(UserAuthorityManagerService stub) throws RemoteException{
		stub.findUser(0001);
		stub.changeRole(0002);
	}
	public static void main(String[] args) throws RemoteException {
		UserAuthorityManagerService_driver d=new UserAuthorityManagerService_driver();
		UserAuthorityManagerService stub=new UserAuthorityManagerService_Stub();
		d.drive(stub);
	}
}
