package vo.administratorvo;

import java.io.Serializable;

import po.administratorpo.Rolepo;
import po.administratorpo.UserMespo;

public class QueryUservo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -484909105464036124L;
	/**
	 * 
	 */
	private UserMespo um;
	public QueryUservo(UserMespo um){
		this.um=um;
	}
	public String getID(){
		return um.getID();
	}
	public String getPassword(){
		return um.getPassword();
	}
	public String getName(){
		return um.getName();
	}
	public Rolepo getRole(){
		return um.getRole();
	}

}
