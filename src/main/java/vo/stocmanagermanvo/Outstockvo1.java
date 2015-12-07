package vo.stocmanagermanvo;

import java.io.Serializable;

public class Outstockvo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6872347294806922963L;

	public final String year;
	public final String month;
	public final String day;
	public final String bianhao;
	public final String destination;
	public final String zhongzhuan;
	
	public Outstockvo1(String y, String m, String d, String b, String dt,String zz) {
		// TODO Auto-generated constructor stub
		year=y;
		month=m;
		day=d;
		bianhao=b;
		destination=dt;
		zhongzhuan=zz;
	}

}
