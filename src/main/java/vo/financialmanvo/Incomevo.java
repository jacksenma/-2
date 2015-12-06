package vo.financialmanvo;

import java.io.Serializable;

public class Incomevo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -229513217426505047L;
	public final String unit;
	public final String person;
	public final String unit2;
	public final String money;
	public final String address;
	public Incomevo(String u1,String p,String u2,String m,String a){
		unit=u1;
		person=p;
		unit2=u2;
		money=m;
		address=a;
		
	}
	

}
