package vo.administratorvo;

import java.io.Serializable;

public class QueryMesvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6811383125172086285L;
	String id;
	public QueryMesvo(String s){
		id=s;
	}
	public String getID(){
		return id;
	}

}
