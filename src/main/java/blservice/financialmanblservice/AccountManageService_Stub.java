package blservice.financialmanblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financialmanvo.AccountManagevo;

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
	
}
