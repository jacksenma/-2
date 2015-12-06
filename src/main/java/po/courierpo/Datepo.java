package po.courierpo;

import java.io.Serializable;

public class Datepo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1082838891134037988L;

	public final int year;
	
	public final int month;
	
	public final int day;
	
	public Datepo(int y , int m , int d){
		year = y;
		
		month = m;
		
		day = d;
	}
	

}
