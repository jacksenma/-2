package vo.bushallsalmanvo;

import java.io.Serializable;

public class CarMesManagevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4325451019595574540L;

	public final String cardaihao;
	public final String chepaihao;
	public final String year;
	public final String month;
	public final String day;
	
	public CarMesManagevo(String cd, String cp, String y, String m, String d) {
		// TODO Auto-generated constructor stub
		cardaihao=cd;
		chepaihao=cp;
		year=y;
		month=m;
		day=d;
	}

	public static CarMesManagevo getInformation(){
		return new CarMesManagevo(null, null, null, null, null);
		
	}
}
