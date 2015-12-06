package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.CashRegistervo;
import vo.financialmanvo.RecieveListvo;

public class CashReceiveOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 297620571692198281L;

	public final String year;
	public final String month;
	public final String day;
	public final String money;
	public final String kuaidiyuan;
	public final String tiaoxingma;
	public final String ID;
	public final String zhanghu;
	
	public CrExamineType cre;
	
	public CashReceiveOrderpo(CashRegistervo cr) {
		// TODO Auto-generated constructor stub
		year=cr.year;
		month=cr.month;
		day=cr.day;
		money=cr.money;
		kuaidiyuan=cr.kuaidiyuan;
		tiaoxingma=cr.tiaoxingma;
		ID=cr.ID;
		zhanghu=cr.zhanghu;
		
		cre=CrExamineType.NOApproval;
		
	}
	
	public CrExamineType getExamineType() {
        return cre;
    }

	 public String getID() {
		// TODO Auto-generated method stub
		return tiaoxingma;
	}
	 public RecieveListvo getRecieveList() {
			// TODO Auto-generated method stub
			return (new RecieveListvo(year, month, day, money, kuaidiyuan, tiaoxingma, ID));
		}

}
