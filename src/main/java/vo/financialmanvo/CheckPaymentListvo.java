package vo.financialmanvo;

import java.io.Serializable;

import po.financialmanpo.CostOrderpo;

public class CheckPaymentListvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4395604280122643752L;
	private CostOrderpo cp;
	public CheckPaymentListvo(CostOrderpo cp){
		this.cp=cp;
	}
	public String getYear(){
		return cp.dvo.year;
	}
	public String getMonth(){
		return cp.dvo.mouth;
	}
	public String getDay(){
		return cp.dvo.day;
	}
	public String getMoney(){
		return cp.pay.money;
	}
	public String getAccount(){
		return cp.pay.account;
	}
	public String getName(){
		return cp.pay.name;
	}
	public String getyearfee(){
		return cp.tiaomu.yearfee;
	}
	public String getTBonus(){
		return cp.tiaomu.bonus;
	}
	public String getSalary(){
		return cp.tiaomu.salary;
	}
	public String getTrafficfee(){
		return cp.tiaomu.trafficfee;
	}
	public String getMoneyyear(){
		return cp.beizhu.moneyyear;
	}
	public String getMoneymonth(){
		return cp.beizhu.moneymouth;
	}
	public String getNumber(){
		return cp.beizhu.number;
	}
}
