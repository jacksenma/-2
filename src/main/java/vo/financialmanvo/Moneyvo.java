package vo.financialmanvo;

import java.io.Serializable;

public class Moneyvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6048890290004461791L;
	public final String money;
	public final String yearfee;
	public final String trafficfee;
	public final String salary;
	public final String bonus;
	public Moneyvo(String m,String y,String t,String s,String b){
		money=m;
		yearfee=y;
		trafficfee=t;
		salary=s;
		bonus=b;
	}
	

}
