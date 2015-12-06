package vo.administratorvo;

import java.io.Serializable;

public class UserAuthorityManagervo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2154012444808408718L;

	/**
	 * 
	 */
	public final String ID;
	public final String Mima;
	public final String Name;
	public final int Type;
	public UserAuthorityManagervo(String i,String m,String n,int t){
		ID=i;
		Mima=m;
		Name=n;
		Type=t;
	}
	
	
	
}
