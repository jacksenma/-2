package po.bushallsalmanpo;

import java.io.Serializable;

import po.courierpo.Datepo;
import vo.bushallsalmanvo.Sendvo;

public class SendOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 636749798054471572L;
	
	public final Datepo date;
	public final String tiaoxingma;
	public final String paijianyuan;
	
	final SoExamineType soe;

	public SendOrderpo(Sendvo send) {
		// TODO Auto-generated constructor stub
		date=new Datepo(send.date.year , send.date.month ,send.date.day);
		tiaoxingma=send.tiaoxingma;
		paijianyuan=send.paijianyuan;
		
		soe=SoExamineType.NOApproval;
	}

	public SoExamineType getExamineType() {
		// TODO Auto-generated method stub
		return soe;
	}

}
