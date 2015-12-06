package vo.financialmanvo;


import java.io.Serializable;
public class Payvo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8860639842254766100L;
	/**
	 * 
	 */
	
	public final String money;
	public final String name;
	public final String account;
	public Payvo(String string,String n,String a){
		money=string;
		name=n;
		account=a;
		
		
	}
	
	

}
