package vo.generalmanagervo;

import java.io.Serializable;

public class SalaryFormulatevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5628118504708305954L;

	public String how;
	public double amount;
	
	public SalaryFormulatevo(String s,double d){
		how=s;
		amount=d;
	}
}
