package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.Sendvo;

public class SendOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 636749798054471572L;
	
	public final String year;
	public final String month;
	public final String day;
	public final String tiaoxingma;
	public final String paijianyuan;
	
	final SoExamineType soe;

	public SendOrderpo(Sendvo send) {
		// TODO Auto-generated constructor stub
		year=send.year;
		month=send.month;
		day=send.day;
		tiaoxingma=send.tiaoxingma;
		paijianyuan=send.paijianyuan;
		
		soe=SoExamineType.NOApproval;
	}

	public SoExamineType getExamineType() {
		// TODO Auto-generated method stub
		return soe;
	}

}
