package vo.stocmanagermanvo;

import java.io.Serializable;

public class Kuaidivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1403993641368538865L;

	public final String year;
	public final String month;
	public final String day;
	public final String bianhao;
	public final String destination;
	
	public Kuaidivo(String y, String m, String d, String b, String dt) {
		// TODO Auto-generated constructor stub
		year=y;
		month=m;
		day=d;
		bianhao=b;
		destination=dt;
	}

}
