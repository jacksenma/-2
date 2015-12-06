package vo.financialmanvo;
import java.io.Serializable;
public class Tiaomuvo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4823183197377939107L;
	public final String yearfee;
	public final String trafficfee;
	public final String salary;
	public final String bonus;
	public Tiaomuvo(String string,String string2,String string3,String string4){
		yearfee=string;
		trafficfee=string2;
		salary=string3;
		bonus=string4;
	}

}
