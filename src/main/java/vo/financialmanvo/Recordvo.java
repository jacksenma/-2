package vo.financialmanvo;

import java.io.Serializable;

public class Recordvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7583399718776146989L;
	public final String year;
	public final String month;
	public final String day;
	public final String behavior;
	public Recordvo(String y,String m, String d,String b){
		year=y;
		month=m;
		day=d;
		behavior=b;
		
	}
	

}
