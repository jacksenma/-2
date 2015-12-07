package vo.financialmanvo;

import java.io.Serializable;

import po.financialmanpo.Accountpo;

public class AccountUservo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 9081496450229056009L;

//	public String accountName;
//	
//	public String money;
	private Accountpo ap;
	public AccountUservo(Accountpo ap){
		this.ap=ap;
	}
	public String getaccountName(){
		return ap.getAccountName();
	}
	public String getMoney(){
		return ap.getMoney();
	}
}
