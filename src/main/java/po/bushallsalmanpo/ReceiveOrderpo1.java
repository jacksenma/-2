package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.Receivevo1;

public class ReceiveOrderpo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3957578445169028029L;
	public final String year;
	public final String month;
	public final String day;
	public final String zhongzhuan;
	public final String chufa;
	public final String ID;
	
	public ReceiveOrderpo1(Receivevo1 r1){
		year=r1.year;
		month=r1.month;
		day=r1.day;
		zhongzhuan=r1.zhongzhuan;
		chufa=r1.chufa;
		ID=r1.ID;
	}
}
