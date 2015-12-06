package vo.financialmanvo;

import java.io.Serializable;

public class Beizhuvo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4574019283268795423L;
	public final String moneyyear;
	public final String number;
	public final String moneymouth;
	public Beizhuvo(String string,String n,String string2){
		moneyyear=string;
		number=n;
		moneymouth=string2;
	}

}
