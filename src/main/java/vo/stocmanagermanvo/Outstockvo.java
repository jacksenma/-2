package vo.stocmanagermanvo;

import java.io.Serializable;

public class Outstockvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6537200582490272881L;

	public final Outstockvo1 out1;
	
	public final Zhuangyunvo zy;
	
	public Outstockvo(Outstockvo1 o1, Zhuangyunvo z) {
		// TODO Auto-generated constructor stub
		out1=o1;
		zy=z;
	}

}
