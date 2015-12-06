package po.transitmanpo;

import java.io.Serializable;
import java.util.Date;

import po.courierpo.Datepo;
import po.courierpo.ExamineType;
import vo.couriervo.Datevo;


public class TransitReceiveOrderpo implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -7802610911564199735L;

	public final String cenID;
	
	public final Datepo date;
	
	public final String ID;
	
	public final String start;
	
	public final GoodStatepo type;
	
	public ExamineType ext;
	
	public TransitReceiveOrderpo(String c , Datevo d , String i , String s , int t){

		cenID = c;
		date = new Datepo(d.year , d.month , d.day);
		ID = i;
		start = s;
		type = GoodStatepo.getState(t);
		ext = ExamineType.NotApprove;
	}

}
