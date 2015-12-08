package blservice.administratorblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;
import vo.administratorvo.UserAuthorityManagervo;


public interface UserAuthorityManagerService extends Remote {
//	public UserAuthorityManagervo findUser(int id)  throws RemoteException;
//	public UserAuthorityManagervo changeRole(int id)  throws RemoteException;
	public boolean getOrder(UserAuthorityManagervo u) throws RemoteException;
	public QueryUservo checkOrder(QueryMesvo qvo) throws RemoteException;
	public boolean deleteOrder(UserAuthorityManagervo qvo)throws RemoteException;
//	public void deleteUser(QueryUservo find)throws RemoteException;
//	
//	public boolean changeOrder(UserAuthorityManagervo uavo)throws RemoteException;
	public boolean changeOrder(UserAuthorityManagervo o, UserAuthorityManagervo n)throws RemoteException;
	public UserAuthorityManagervo[] searchAll() throws RemoteException;
}
