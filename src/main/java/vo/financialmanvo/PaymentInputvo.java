package vo.financialmanvo;

import java.io.Serializable;

public class PaymentInputvo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2539033649426189301L;
	public final Datevo date;
	public final Payvo pay;
	public final Tiaomuvo tiaomu;
	public final Beizhuvo beizhu;
	public PaymentInputvo(Datevo d,Payvo p,Tiaomuvo t,Beizhuvo b){
		date=d;
		pay=p;
		tiaomu=t;
		beizhu=b;
		
	}
}
