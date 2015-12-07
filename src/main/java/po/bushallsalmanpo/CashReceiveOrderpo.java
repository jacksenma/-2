package po.bushallsalmanpo;

import java.io.Serializable;

import po.courierpo.Datepo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.couriervo.Datevo;
import vo.financialmanvo.RecieveListvo;

public class CashReceiveOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 297620571692198281L;

	public final Datevo date1;
	public final Datepo date;
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
		date1=cr.date;
		date=new Datepo(cr.date.year , cr.date.month , cr.date.day);
		year=cr.date.year+"";
		month=cr.date.month+"";
		day=cr.date.day+"";
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

	public CashRegistervo getCash() {
		// TODO Auto-generated method stub
		return new CashRegistervo(date1, money, kuaidiyuan, tiaoxingma, ID, zhanghu);
	}

}
