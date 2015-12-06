package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.AccountManagevo;

public class Accountpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7908145719661294777L;
	final String account;
	final String money;
	public Accountpo(AccountManagevo mes){
		account=mes.accountName;
		money=mes.money;
	}
	public String getAccountName(){
		return account;
	}
	public String getMoney(){
		return money;
	}
		
		
	

}
