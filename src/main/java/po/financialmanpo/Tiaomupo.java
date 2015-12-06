package po.financialmanpo;

import java.io.Serializable;

public class Tiaomupo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5491721689727604666L;
	/**
	 * 
	 */

	public final String yearfee;
	public final String trafficfee;
	public final String salary;
	public final String bonus;
	public Tiaomupo(String string,String string2,String string3,String string4){
		yearfee=string;
		trafficfee=string2;
		salary=string3;
		bonus=string4;
	}

}
