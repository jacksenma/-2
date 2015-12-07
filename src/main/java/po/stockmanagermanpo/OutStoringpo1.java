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
	public final String zhongzhuan;
	
	public OutStoringpo1(String year,String month,String day,String bianhao,String destination,String zhongzhuan){
		this.year=year;
		this.month=month;
		this.day=day;
		this.bianhao=bianhao;
		this.destination=destination;
		this.zhongzhuan=zhongzhuan;
	}
}
