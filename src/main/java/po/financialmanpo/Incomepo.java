package po.financialmanpo;

import java.io.Serializable;

public class Incomepo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7876385850684565760L;
	public final String unit;
	public final String person;
	public final String unit2;
	public final String money;
	public final String address;
	public Incomepo(String u1,String p,String u2,String m,String a){
		unit=u1;
		person=p;
		unit2=u2;
		money=m;
		address=a;
		
	}
	public String getunit1(){
		return unit;
	}
	public String getperson(){
		return person;
	}
	public String getunit2(){
		return unit2;
	}
	public String getmoney(){
		return money;
	}
	public String getaddress(){
		return address;
	}

}
