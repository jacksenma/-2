package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.Commonvo;

public class Commonpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7929545403397108653L;
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
	
	public Commonpo(Commonvo com) {
		driverbianhao=com.driverbianhao;
		name=com.name;
		chushengyear=com.chushengyear;
		chushengmonth=com.chushengmonth;
		chushengday=com.chushengday;
		shengfenID=com.shengfenID;
		phone=com.phone;
		xingshiyear=com.xingshiyear;
		xingshimonth=com.xingshimonth;
		xingshiday=com.xingshiday;
	}
}
