package businesslogic.administratorbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.administratorblservice.UserAuthorityManagerService;
import data.safetydata.AddaccountIO;
import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;
import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;
import vo.administratorvo.UserAuthorityManagervo;
import vo.generalmanagervo.Staffvo;

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
//		System.out.println(o.beizhu.moneymouth+"sfeferegrttry");
//		System.out.println("ssss");

//            FinancialmanService cs = new PaymentListIO();
		///////////////////////////////////////////////////////////////////
		AdministratorService cs=new AddaccountIO();
		
            try {
				
            	if(cs.writeOrder(new UserMespo(o))){
            		System.out.println("getOrder");
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
            		System.out.println("delete.............");
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
        		System.out.println("change.............");
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
		
	

//	public void deleteUser(UserAuthorityManagervo find) throws RemoteException {
//		// TODO Auto-generated method stub
//		AdministratorService is=new AddaccountIO();
//		is.deleteUser(new UserMespo(find));
//		
//	}

//	public void deleteUser(QueryUservo find) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}

	

	
	

	


}
