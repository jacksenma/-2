package vo.financialmanvo;

import java.io.Serializable;

public class InitMesvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3992409299672001705L;
	//机构，人员，车辆，库存，名称，资金
	public final String jg;
	public final String ry;
	public final String cl;
	public final String kc;
	public final String mc;
	public final String zj;
	
	public InitMesvo(String j,String r,String c,String k,String m,String z){
		jg=j;
		ry=r;
		cl=c;
		kc=k;
		mc=m;
		zj=z;
	}
	

}
