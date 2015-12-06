package vo.bushallsalmanvo;

import java.io.Serializable;

public class Receivevo1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3880277280772014181L;
	public final String year;
	public final String month;
	public final String day;
	public final String zhongzhuan;
	public final String chufa;
	public final String ID;

	public Receivevo1(String y, String m, String d, String z, String c, String t) {
		// TODO Auto-generated constructor stub
		year=y;
		month=m;
		day=d;
		zhongzhuan=z;
		chufa=c;
		ID=t;
	}

	public static Receivevo1 getReceiveInformation(){
		return new Receivevo1(null, null, null, null, null,null);
	}
	
	public static Sendvo getSendInformation(){
		return new Sendvo(null, null, null, null, null);
	}
}
