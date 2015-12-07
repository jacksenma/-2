package vo.financialmanvo;

import java.io.Serializable;

public class AccountMesvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6056869025439991800L;
	public final String name;
//	public final String money;
	public AccountMesvo(String n){
		name=n;
//		money=m;
		
	}
	public String getName(){
		return name;
	}

}
