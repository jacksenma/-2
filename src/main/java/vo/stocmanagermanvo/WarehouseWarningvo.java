package vo.stocmanagermanvo;

import java.io.Serializable;

public class WarehouseWarningvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2398682387720827485L;

	public final String warning;
	public final String zhongzhuan;
	
	public WarehouseWarningvo(String w, String zz) {
		// TODO Auto-generated constructor stub
		warning=w;
		zhongzhuan=zz;
	}

	public static WarehouseWarningvo getInformation(){
		return new WarehouseWarningvo(null, null);
	}
}
