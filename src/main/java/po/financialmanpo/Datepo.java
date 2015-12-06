package po.financialmanpo;

import java.io.Serializable;

public class Datepo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8857752218482834173L;
	/**
	 * 
	 */

	public final String year;
	public final String mouth;
	public final String day;
	
	public Datepo(String string,String string2,String string3){
		year = string;
		mouth = string2;
		day = string3;
		
		
		
	}
	

}