package vo.bushallsalmanvo;

import java.io.Serializable;

import vo.couriervo.Datevo;

public class Receivevo1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3880277280772014181L;
	public final Datevo date;
	public final String zhongzhuan;
	public final String chufa;
	public final String ID;

	public Receivevo1(Datevo d, String z, String c, String t) {
		// TODO Auto-generated constructor stub
		date=d;
		zhongzhuan=z;
		chufa=c;
		ID=t;
	}

	public static Receivevo1 getReceiveInformation(){
		return new Receivevo1(null, null, null, null);
	}
	
	public static Sendvo getSendInformation(){
		return new Sendvo(null, null, null);
	}
}
