package businesslogic.administratorbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.host.HostLog;
import blservice.administratorblservice.UserAuthorityManagerService;
import data.safetydata.AddaccountIO;
import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;
import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;
import vo.administratorvo.UserAuthorityManagervo;

public class UserAuthorityManagerImpl extends UnicastRemoteObject implements UserAuthorityManagerService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 559751419304538499L;
	/**
	 * 
	 */

	public UserAuthorityManagerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAuthorityManagervo findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserAuthorityManagervo changeRole(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean getOrder(UserAuthorityManagervo o) {
		// TODO Auto-generated method stub

		AdministratorService cs=new AddaccountIO();
		
            try {
				
            	if(cs.writeOrder(new UserMespo(o))){
            		HostLog.addMes("增加用户账户： "+"\n"+"账户ID： "+o.ID+"\n"+"账户密码： "+o.Mima+"\n"
            				+"员工姓名： "+o.Name+"\n"+"账户权限： "+o.Type+"\n");
            		return true;
            	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}
	
	public boolean deleteOrder(UserAuthorityManagervo o) {
		// TODO Auto-generated method stub

		AdministratorService cs=new AddaccountIO();
		
            try {
				
            	if(cs.deleteUser(new UserMespo(o))){
            		HostLog.addMes("删除ID为  "+o.ID+" 的用户账户"+"\n");
            		return true;
            	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	
	
	public QueryUservo checkOrder(QueryMesvo qvo) {
        //To change body of generated methods, choose Tools | Templates.
	   AdministratorService es = new AddaccountIO();
	 
	   
       UserMespo co;
		try {
			co = es.search(qvo.getID());
			if(co == null) return null;
			HostLog.addMes("查找ID为  "+qvo.getID()+" 的用户账户"+"\n");
	        return new QueryUservo(co);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
   }

	public boolean changeOrder(UserAuthorityManagervo o,UserAuthorityManagervo n) {
		// TODO Auto-generated method stub
		AdministratorService cs=new AddaccountIO();
		
        try {
			
        	if(cs.changeUser(new UserMespo(o),new UserMespo(n))){
        		HostLog.addMes("修改用户账户(修改后信息如下)： "+"\n"+"账户ID： "+o.ID+"\n"+"账户密码： "+o.Mima+"\n"
        				+"员工姓名： "+o.Name+"\n"+"账户权限： "+n.Type+"\n");
        		return true;
        	}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
	}

	@Override
	public UserAuthorityManagervo[] searchAll()throws RemoteException {
		// TODO Auto-generated method stub
		AdministratorService as=new AddaccountIO();
		UserMespo[] up;
		try {
			up = as.AllSearch();
			if(up==null)  return null;
			else{
				HostLog.addMes("显示全部用户账户信息 "+"\n");
				UserAuthorityManagervo[] uv = new UserAuthorityManagervo[up.length];
				for(int i=0;i<up.length;i++){
					UserAuthorityManagervo s = up[i].geUser();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		}
		
	



	

	
	

	


}
