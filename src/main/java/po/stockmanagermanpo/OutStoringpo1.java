package po.stockmanagermanpo;

import java.io.Serializable;

public class OutStoringpo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7179670146679516174L;
	public final String year;
	public final String month;
	public final String day;
	public final String bianhao;
	public final String destination;
	
	public OutStoringpo1(String year,String month,String day,String bianhao,String destination){
		this.year=year;
		this.month=month;
		this.day=day;
		this.bianhao=bianhao;
		this.destination=destination;
	}
}
