package vo.queryvo;

import java.io.Serializable;

public class Queryvo implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5129553011730062584L;
	String number;
    
    public Queryvo(String s) {
        number = s;
    }
    
    public String getID() {
        return number;
    }

}
