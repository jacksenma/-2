package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.Beizhuvo;
import vo.financialmanvo.Datevo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.Payvo;
import vo.financialmanvo.Tiaomuvo;

public class CostOrderpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6035340333141173086L;
    public final Datepo dvo;
    public final String ID;
    public final Paypo pay;
    public final Tiaomupo tiaomu;
    public final Beizhupo beizhu;
	public ExamineType ext;
	public final Datevo d;
    public final Payvo p;
	public final Tiaomuvo t;
	public final Beizhuvo b;
	public CostOrderpo(PaymentInputvo order){
		System.out.println(order.pay.name+"jdkhfdgf");
		dvo=new Datepo(order.date.year,order.date.mouth,order.date.day);
		ID=order.beizhu.number;
		pay=new Paypo(order.pay.money, order.pay.name, order.pay.account);
		tiaomu=new Tiaomupo(order.tiaomu.yearfee, order.tiaomu.trafficfee, order.tiaomu.salary,
				order.tiaomu.bonus);
		beizhu=new Beizhupo(order.beizhu.moneyyear, order.beizhu.number, order.beizhu.moneymouth);
		ext = ExamineType.NOApproval;
		d=order.date;
		p=order.pay;
		t=order.tiaomu;
		b=order.beizhu;
		
	}
	public Datepo getDate(){
		return dvo;
	}
	public String getID(){
		return ID;
	}
	public Paypo getPaymentMes(){
		return pay;
	}
	public Tiaomupo getTiaomu(){
		return tiaomu;
	}
	public Beizhupo getBeizhu(){
		return beizhu;
	}
	public ExamineType getExamineType() {
	        return ext;
	    }
	public PaymentInputvo getPaymentList() {
		// TODO Auto-generated method stub
		return (new PaymentInputvo(d, p, t, b));
		
	}

}
