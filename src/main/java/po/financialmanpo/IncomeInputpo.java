package po.financialmanpo;

import java.io.Serializable;

import po.courierpo.ExamineType;
import vo.financialmanvo.IncomeInputvo;

public class IncomeInputpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5488232342734123708L;
	final Datepo dvo;
	final Incomepo ipo;
	final ExamineType ext;
	public IncomeInputpo(IncomeInputvo order){
		dvo=new Datepo(order.date.year,order.date.mouth,order.date.day);
		ipo=new Incomepo(order.income.unit,order.income.person,order.income.unit2,order.income.money,
				order.income.address);
		ext = ExamineType.NOApproval;
	}
	 public ExamineType getExamineType() {
	        return ext;
	    }
	 public Datepo getDate(){
		 return dvo;
	 }
	 public Incomepo getIncomeMes(){
		 return ipo;
	 }
}
