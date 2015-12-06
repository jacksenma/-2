package vo.bushallsalmanvo;

import java.io.Serializable;

public class Sendvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2245368753502249560L;
	public final String year;
	public final String month;
	public final String day;
	public final String tiaoxingma;
	public final String paijianyuan;
	public Sendvo(String y, String m, String d, String t, String p) {
		// TODO Auto-generated constructor stub
		year=y;
		month=m;
		day=d;
		tiaoxingma=t;
		paijianyuan=p;
	}

}
