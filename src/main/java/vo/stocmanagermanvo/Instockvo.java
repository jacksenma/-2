package vo.stocmanagermanvo;

import java.io.Serializable;

public class Instockvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6339378499871503878L;

	public final Kuaidivo kuaidi;
	public final Weizhivo weizhi;
	
	public Instockvo(Kuaidivo kd, Weizhivo wz) {
		// TODO Auto-generated constructor stub
		kuaidi=kd;
		weizhi=wz;
	}

}
