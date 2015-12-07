package vo.bushallsalmanvo;

import java.io.Serializable;

import vo.couriervo.Datevo;

public class Sendvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2245368753502249560L;
	public final Datevo date;
	public final String tiaoxingma;
	public final String paijianyuan;
	public Sendvo(Datevo dv, String t, String p) {
		// TODO Auto-generated constructor stub
		date=dv;
		tiaoxingma=t;
		paijianyuan=p;
	}

}
