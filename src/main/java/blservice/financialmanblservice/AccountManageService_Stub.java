package blservice.financialmanblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.InitMesvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;

public class AccountManageService_Stub implements AccountManageService{
	public AccountManagevo showAccount(){
		System.out.println("查找账户属性");
		return null;
	}

	public AccountManagevo addAcount(String name) {
		// TODO Auto-generated method stub
		System.out.println("增加账户");
		return null;
	}

	public boolean deleteAccount() {
		System.out.println("删除账户");
		// TODO Auto-generated method stub
		return false;
	}

	public AccountManagevo changeAccount(String name) {
		System.out.println("修改账户属性");
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo Initialize(String jigou, ArrayList<String> renyuan, ArrayList<String> cheliang, int kucun,
			String accountname, int money) {
		System.out.println("初始化账户");
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getOrder(AccountManagevo amvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getOrder(InitMesvo ivo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AccountUservo findUsers(AccountMesvo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountManagevo[] searchAll() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecieveListvo[] searchRe(String text) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentInputvo[] searchPay(String text) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountManagevo[] searchMo(String text) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAccount(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getZong(int parseInt, String[] jqPay, String[] jqRe,int a,int b) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean writeInitAccount() throws RemoteException {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountManagevo[] searchAllInitAccount() throws RemoteException {
		// TODO Auto-generated method stub
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
		return false;
	}

	@Override
	public Institutionvo[] searchAllInitJigou() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staffvo[] searchAllInitRenyuan() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
