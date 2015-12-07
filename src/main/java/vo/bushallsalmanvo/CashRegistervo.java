package vo.bushallsalmanvo;

import java.io.Serializable;

import vo.couriervo.Datevo;

public class CashRegistervo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 133566084811595475L;

	public final Datevo date;
	public final String money;
	public final String kuaidiyuan;
	public final String tiaoxingma;
	public final String ID;
	public final String zhanghu;
	
	public CashRegistervo(Datevo d, String me, String k, String t, String id, String zh) {
		// TODO Auto-generated constructor stub
		date=d;
		money=me;
		kuaidiyuan=k;
		tiaoxingma=t;
		ID=id;
		zhanghu=zh;
	}

	public static CashRegistervo getInformation(){
		return new CashRegistervo(null, null, null, null, null, null);
		
	}
}
