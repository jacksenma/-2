package vo.bushallsalmanvo;

import java.io.Serializable;

public class Commonvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8561780539992598353L;
	public final String driverbianhao;
	public final String name;
	public final String chushengyear;
	public final String chushengmonth;
	public final String chushengday;
	public final String shengfenID;
	public final String phone;
	public final String xingshiyear;
	public final String xingshimonth;
	public final String xingshiday;
	public Commonvo(String db, String n, String csy, String csm, String csd, String sf,
			String p, String xsy, String xsm, String xsd) {
		// TODO Auto-generated constructor stub
		driverbianhao=db;
		name=n;
		chushengyear=csy;
		chushengmonth=csm;
		chushengday=csd;
		shengfenID=sf;
		phone=p;
		xingshiyear=xsy;
		xingshimonth=xsm;
		xingshiday=xsd;
	}

	
}
