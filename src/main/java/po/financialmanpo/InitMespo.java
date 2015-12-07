package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.InitMesvo;

public class InitMespo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3422043413296774621L;
	 final String jg;
	 final String ry;
	 final String cl;
	 final String kc;
	 final String mc;
	 final String zj;
	
	public InitMespo(InitMesvo mes){
		jg=mes.jg;
		ry=mes.ry;
		cl=mes.cl;
		kc=mes.kc;
		mc=mes.mc;
		zj=mes.zj;
	}
	public String getJigou(){
		return jg;
	}
	public String getRenyuan(){
		return ry;
	}
	public String getCheliang(){
		return cl;
	}
	public String getKucun(){
		return kc;
	}
	public String getName(){
		return mc;
	}
	public String getMoney(){
		return zj;
	}

}
