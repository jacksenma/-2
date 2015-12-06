package vo.bushallsalmanvo;

import java.io.Serializable;

public class CashRegistervo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 133566084811595475L;

	public final String year;
	public final String month;
	public final String day;
	public final String money;
	public final String kuaidiyuan;
	public final String tiaoxingma;
	public final String ID;
	public final String zhanghu;
	
	public CashRegistervo(String y, String mt, String d, String me, String k, String t, String id, String zh) {
		// TODO Auto-generated constructor stub
		year=y;
		month=mt;
		day=d;
		money=me;
		kuaidiyuan=k;
		tiaoxingma=t;
		ID=id;
		zhanghu=zh;
	}

	public static CashRegistervo getInformation(){
		return new CashRegistervo(null, null, null, null, null, null, null, null);
		
	}
}
