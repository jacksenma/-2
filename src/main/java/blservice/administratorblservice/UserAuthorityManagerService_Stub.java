package blservice.administratorblservice;

import java.rmi.RemoteException;

import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;
import vo.administratorvo.UserAuthorityManagervo;

public class UserAuthorityManagerService_Stub implements UserAuthorityManagerService {
	public UserAuthorityManagervo findUser(int id){
		System.out.println("查找用户");
		return new UserAuthorityManagervo(null, null, null, id);
	}
	public UserAuthorityManagervo changeRole(int id){
		System.out.println("改变权限");
		return new UserAuthorityManagervo(null, null, null, id);
	}
	public boolean getOrder(UserAuthorityManagervo u) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public QueryUservo checkOrder(QueryMesvo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteOrder(UserAuthorityManagervo qvo) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean changeOrder(UserAuthorityManagervo uavo,UserAuthorityManagervo uav) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public UserAuthorityManagervo[] searchAll() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
