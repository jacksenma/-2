package po.stockmanagermanpo;

import java.io.Serializable;

public class Weizhipo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5078896069334060953L;
	public final String quhao;
	public final String paihao;
	public final String jiahao;
	public final String weihao;
	
	
	public Weizhipo(String q, String p, String j, String w) {
		// TODO Auto-generated constructor stub
		quhao=q;
		paihao=p;
		jiahao=j;
		weihao=w;
	}
}
