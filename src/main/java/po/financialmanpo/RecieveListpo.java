package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.RecieveListvo;

public class RecieveListpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -357248211772105976L;
	public final String year1;
	public final String month1;
	public final String day1;
	public final String kdy1;
	public final String money1;
	public final String id1;
	public final String Zhanghu1;
	public final String tiaoxingma1;
	
	public RecieveListpo(RecieveListvo list){
		year1=list.yearq;
		month1=list.monthq;
		day1=list.dayq;
		kdy1=list.kuaidiyuanq;
		money1=list.moneyq;
		id1=list.IDq;
		Zhanghu1=list.Zhanghu;
		tiaoxingma1=list.tiaoxingmaq;
		
	}
	public RecieveListvo getRecieveList(){
		return (new RecieveListvo(year1, month1, day1, money1, kdy1, tiaoxingma1, id1,Zhanghu1));
	}
	

}
