package vo.bushallsalmanvo;

import java.io.Serializable;

public class DriverMesManagevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2701068987209995822L;
	
	public final Commonvo common;
	public final Othervo2 other;
	
	public DriverMesManagevo(Commonvo c,Othervo2 o){
		common=c;
		other=o;
	}

	
}
