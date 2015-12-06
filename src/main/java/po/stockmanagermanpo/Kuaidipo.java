package po.stockmanagermanpo;

import java.io.Serializable;

public class Kuaidipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8775494877939663265L;
	public final String year;
	public final String month;
	public final String day;
	public final String bianhao;
	public final String destination;
	
	public Kuaidipo(String year,String month,String day,String bianhao,String destination){
		this.year=year;
		this.month=month;
		this.day=day;
		this.bianhao=bianhao;
		this.destination=destination;
	}
}
