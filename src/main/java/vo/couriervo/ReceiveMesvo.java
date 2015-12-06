package vo.couriervo;

import java.io.Serializable;

public class ReceiveMesvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2300290343835238906L;
	
	public final String ID;
	
	public String receiver;
	
	public Datevo date;
	
	public ReceiveMesvo(String s){
		ID = s;
	}

	/**
	 * 
	 */

}
