package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.Recordvo;

public class Recordpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8315177263619274184L;
	public final String year;
	public final String month;
	public final String day;
	public final String behavior;
	public Recordpo(Recordvo rvo){
		year=rvo.year;
		month=rvo.month;
		day=rvo.day;
		behavior=rvo.behavior;
		
	}
	public String getYear(){
		return year;
		
	}
	public String getMonth(){
		return month;
		
	}
	public String getDay(){
		return day;
		
	}
	public String getBehavior(){
		return behavior;
		
	}
	public Recordvo geUser() {
		// TODO Auto-generated method stub
		return new Recordvo(year, month, day, behavior) ;
	}

}
