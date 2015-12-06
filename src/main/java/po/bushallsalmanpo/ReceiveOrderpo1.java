package po.bushallsalmanpo;

import java.io.Serializable;

import po.courierpo.Datepo;
import vo.bushallsalmanvo.Receivevo1;

public class ReceiveOrderpo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3957578445169028029L;
	public final Datepo date;
	public final String zhongzhuan;
	public final String chufa;
	public final String ID;
	
	public ReceiveOrderpo1(Receivevo1 r1){
		date=new Datepo(r1.date.year , r1.date.month , r1.date.day); 
		zhongzhuan=r1.zhongzhuan;
		chufa=r1.chufa;
		ID=r1.ID;
	}
}
