package po.bushallsalmanpo;

import java.io.Serializable;

import po.courierpo.Datepo;
import vo.bushallsalmanvo.Sendvo;
import vo.couriervo.Datevo;

public class SendOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 636749798054471572L;
	
	public final Datepo date;
	public final String tiaoxingma;
	public final String paijianyuan;
	
	public SoExamineType soe;
	
	public final Datevo date1;

	public SendOrderpo(Sendvo send) {
		// TODO Auto-generated constructor stub
		date1=send.date;
		date=new Datepo(send.date.year , send.date.month ,send.date.day);
		tiaoxingma=send.tiaoxingma;
		paijianyuan=send.paijianyuan;
		
		soe=SoExamineType.NOApproval;
	}

	public SoExamineType getExamineType() {
		// TODO Auto-generated method stub
		return soe;
	}

	public Sendvo getSend() {
		// TODO Auto-generated method stub
		return new Sendvo(date1,tiaoxingma,paijianyuan);
	}

	public String getID() {
		// TODO Auto-generated method stub
		return tiaoxingma;
	}

}
