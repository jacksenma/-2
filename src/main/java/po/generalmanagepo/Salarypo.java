package po.generalmanagepo;

import java.io.Serializable;

import vo.generalmanagervo.SalaryFormulatevo;

public class Salarypo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2192768003583315691L;

	String how;
	double amount;
	
	public Salarypo(SalaryFormulatevo sfv){
		how=sfv.how;
		amount=sfv.amount;	
	}
	public SalaryFormulatevo getSalary(){
		return new SalaryFormulatevo(this.how,this.amount);
	}
}
