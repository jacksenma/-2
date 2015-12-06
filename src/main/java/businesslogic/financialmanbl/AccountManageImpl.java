package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import blservice.financialmanblservice.AccountManageService;
import data.accountdata.AccountIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.financialmanpo.Accountpo;
import po.financialmanpo.InitMespo;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.InitMesvo;

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

}
