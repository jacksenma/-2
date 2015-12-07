package vo.financialmanvo;

import java.io.Serializable;

public class RecieveListvo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6953316987908836919L;
	public final String yearq;
	public final String monthq;
	public final String dayq;
	public final String moneyq;
	public final String kuaidiyuanq;
	public final String tiaoxingmaq;
	public final String IDq;
	public final String Zhanghu;
	
	public RecieveListvo(String y, String mt, String d, String me, String k, String t, String id,String z) {
		// TODO Auto-generated constructor stub
		yearq=y;
		monthq=mt;
		dayq=d;
		moneyq=me;
		kuaidiyuanq=k;
		tiaoxingmaq=t;
		IDq=id;
		Zhanghu=z;
	}

}
