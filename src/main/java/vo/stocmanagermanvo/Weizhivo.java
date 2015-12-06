package vo.stocmanagermanvo;

import java.io.Serializable;

public class Weizhivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7880915421393328717L;

	public final String quhao;
	public final String paihao;
	public final String jiahao;
	public final String weihao;
	
	
	public Weizhivo(String q, String p, String j, String w) {
		// TODO Auto-generated constructor stub
		quhao=q;
		paihao=p;
		jiahao=j;
		weihao=w;
	}

}
