package po.financialmanpo;

import java.io.Serializable;

public class Beizhupo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4698923320922352788L;
	/**
	 * 
	 */
	
	public final String moneyyear;
	public final String number;
	public final String moneymouth;
	public Beizhupo(String string,String n,String string2){
		moneyyear=string;
		number=n;
		moneymouth=string2;
	}

}
