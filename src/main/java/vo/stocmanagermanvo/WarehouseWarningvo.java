package vo.stocmanagermanvo;

import java.io.Serializable;

public class WarehouseWarningvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2398682387720827485L;

	public final String warning;
	
	public WarehouseWarningvo(String w) {
		// TODO Auto-generated constructor stub
		warning=w;
	}

	public static WarehouseWarningvo getInformation(){
		return new WarehouseWarningvo(null);
	}
}
