package vo.financialmanvo;

import java.io.Serializable;

public class AccountManagevo implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -4431565731890262716L;

//管理账户
	
	public String accountName;
	
	public String money;
	
	public AccountManagevo(String a,String m){
		accountName=a;
		money=m;
	}
	
//	public String getAccountName(){
//		return accountName;
//	}
//	
//	public String getMoney(){
//		return money;
//	}
	
}
