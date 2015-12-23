package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import blservice.financialmanblservice.AccountManageService;
import data.accountdata.AccountIO;
import data.institutiondata.BusinessHall;
import data.reformdata.PaymentListIO;
import data.reformdata.RecieveListIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.administratorpo.UserMespo;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.InitMespo;
import vo.administratorvo.UserAuthorityManagervo;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.InitMesvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;

public class AccountManageImpl extends UnicastRemoteObject implements AccountManageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7115447212691987826L;

	public AccountManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManagevo showAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo addAcount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	public AccountManagevo changeAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo Initialize(String jigou, ArrayList<String> renyuan, ArrayList<String> cheliang, int kucun,
			String accountname, int money) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getOrder(AccountManagevo amvo)  {
//		return false;
		FinancialmanService fs=new AccountIO();
		 try {
				System.out.println("sdweretr");
         	if(fs.addAccount(new Accountpo(amvo)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         return false;
		// TODO Auto-generated method stub
//		AccountManageService am=new 
	}

	@Override
	public boolean getOrder(InitMesvo ivo) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		 try {
//				System.out.println("sdweretr");
        	if(fs.addInitMes(new InitMespo(ivo)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public AccountUservo findUsers(AccountMesvo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs = new AccountIO();
		 
		   
	       Accountpo co;
			try {
				co = fs.find(qvo.getName());
				if(co == null) return null;
		        return new AccountUservo(co);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	   
		
		
		
	}

	@Override
	public AccountManagevo[] searchAll() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService as=new AccountIO();
		Accountpo[] up;
		try {
			up = as.AllSearch();
			if(up==null)  return null;
			else{
				AccountManagevo[] uv = new AccountManagevo[up.length];
				for(int i=0;i<up.length;i++){
					AccountManagevo s = up[i].geUser();
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

	@Override
	public RecieveListvo[] searchRe(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new RecieveListIO();
		CashReceiveOrderpo[] rp;
		try {
			rp = fs.SearchRe(text);
			if(rp==null)  return null;
			else{
				RecieveListvo[] rv = new RecieveListvo[rp.length];
				for(int i=0;i<rp.length;i++){
					RecieveListvo s = rp[i].getRecieveList();
					rv[i]= s;
				}
				return rv;
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public PaymentInputvo[] searchPay(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new PaymentListIO();
		CostOrderpo[] rp;
		try {
			rp = fs.SearchPay(text);
			if(rp==null)  return null;
			else{
				PaymentInputvo[] rv = new PaymentInputvo[rp.length];
				for(int i=0;i<rp.length;i++){
					PaymentInputvo s = rp[i].getPaymentList();
					rv[i]= s;
				}
				return rv;
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountManagevo[] searchMo(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		Accountpo[] ap;
		try {
			ap = fs.MoSearch(text);
			if(ap==null)  return null;
			else{
				System.out.println(ap.length);
				AccountManagevo[] av = new AccountManagevo[ap.length];
				for(int i=0;i<ap.length;i++){
					System.out.println("zhe");
					AccountManagevo s = ap[i].geUser();
					av[i]= s;
				}
				return av;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteAccount(String name) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		 try {
				
         	if(fs.deleteAcc(name)){
         		System.out.println("delete.............");
         		return true;
         	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         return false;
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		try {
			fs.writeInit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int getZong(int parseInt, String[] jqPay, String[] jqRe,int jqRecount,int jqPaycount) throws RemoteException {
		// TODO Auto-generated method stub
		int Re=0;
    	for(int w=0;w<jqRecount;w++){

    		Re+=Integer.parseInt(jqRe[w]);
    	}

    	int Pay=0;
    	for(int qw=0;qw<jqPaycount;qw++){
    		Pay+=Integer.parseInt(jqPay[qw]);
    	}
    	int result=parseInt+Re-Pay;
    	return result;
	}

	@Override
	public boolean writeInitAccount() throws RemoteException {
		
		try {
			FinancialmanService fs=new AccountIO();
			Accountpo[] ap;
			ap = fs.AllSearch();
			if(ap==null)  return false;
			else{
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitAccount(ap[i]);
					if(a==false)
						return false;
				}
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public AccountManagevo[] searchAllInitAccount() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService as=new AccountIO();
		Accountpo[] up;
		try {
			up = as.AllSearchInitAccount();
			if(up==null)  return null;
			else{
				AccountManagevo[] uv = new AccountManagevo[up.length];
				for(int i=0;i<up.length;i++){
					AccountManagevo s = up[i].geUser();
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

	@Override
	public boolean writeInitJigou() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean writeInitRenyuan() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean writeInitKucun() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean writeInitCheliang() throws RemoteException {
		// TODO Auto-generated method stub
//		try {
//			BusinessHall fs=new BusinessHall();
//			CarLoadingpo[] ap;
////			ap = fs.AllSearch();
//			if(ap==null)  return false;
//			else{
//				for(int i=0;i<ap.length;i++){
////					boolean a=fs.addInitCheliang(ap[i]);
////					if(a==false)
//						return false;
//				}
//				return true;
//			}
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		return false;
	}

}
