package po.stockmanagermanpo;

import java.io.Serializable;

import vo.stocmanagermanvo.WarehouseWarningvo;

public class Warningpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3468660587535634586L;
	public final String warning;
	public final String zhongzhuan;
	
	public Warningpo(WarehouseWarningvo wa) {
		// TODO Auto-generated constructor stub
		warning=wa.warning;
		zhongzhuan=wa.zhongzhuan;
	}
	public WarehouseWarningvo getMes(){
		return new WarehouseWarningvo(warning, zhongzhuan);
	}

}
