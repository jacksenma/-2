package vo.bushallsalmanvo;

import java.io.Serializable;

public class CarLoadingvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6871645204235068508L;

	//CarLoadingvo carLoadingvo = new CarLoadingvo();
	
	public final String year;
	public final String month;
	public final String day;
	public final String yingYeTing;
	public final String car;
	public final String chuFaDi;
	public final String destinaton;
	public final String jianZhuang;
	public final String yaYun;
	public final String yunFei;
	public final String tuoYunDan;

	
	public CarLoadingvo(String y, String m, String da, String yyt, String c, String cfd, String de,
			String jz, String yy, String yf, String tyd) {
		// TODO Auto-generated constructor stub
		year=y;
		month=m;
		day=da;
		yingYeTing=yyt;
		car=c;
		chuFaDi=cfd;
		destinaton=de;
		jianZhuang=jz;
		yaYun=yy;
		yunFei=yf;
		tuoYunDan=tyd;
	}

	public static CarLoadingvo getInformation(){
		return new CarLoadingvo(null, null, null, null, null, null, null, null, null, null, null);
	}
}
