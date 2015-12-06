package vo.bushallsalmanvo;

import java.io.Serializable;

public class Receivevo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5492083075624899254L;

	public final Receivevo1 receive1;
	public final Receivevo2 receive2;
	
	public Receivevo(Receivevo1 r1, Receivevo2 r2) {
		// TODO Auto-generated constructor stub
		receive1=r1;
		receive2=r2;
	}

	
}
