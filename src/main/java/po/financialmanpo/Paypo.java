package po.financialmanpo;

import java.io.Serializable;

public class Paypo implements Serializable {
	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -2337893068489375033L;
	/**
	 * 
	 */
	
	public final String money;
	public final String name;
	public final String account;
	public Paypo(String string,String n,String a){
		money=string;
		name=n;
		account=a;
		
		
	}
	
	

}
