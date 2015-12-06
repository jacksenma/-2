package vo.financialmanvo;
import java.io.Serializable;
public class Datevo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1957195303463842897L;
	public final String year;
	public final String mouth;
	public final String day;
	
	public Datevo(String string,String string2,String string3){
		year = string;
		mouth = string2;
		day = string3;
		
		
		
	}
	

}
