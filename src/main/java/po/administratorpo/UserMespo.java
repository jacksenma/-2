package po.administratorpo;

import java.io.Serializable;

import po.courierpo.PackingTypepo;
import vo.administratorvo.UserAuthorityManagervo;

public class UserMespo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8597630906845329744L;
	final String id;
	final String name;
	final String password;
	final Rolepo role;//这里的role考虑用UserRole类型
	final int type;
	public UserMespo(UserAuthorityManagervo user){
		id=user.ID;
		name=user.Name;
		password=user.Mima;
		type=user.Type;
		if(user.Type==1) role = Rolepo.kdy;
		else if(user.Type==2) role=Rolepo.yytywy;
		else if(user.Type==3) role=Rolepo.zzzxywy;
		else if(user.Type==4) role=Rolepo.zzzxkcgly;
		else if(user.Type==5) role=Rolepo.ybcwy;
		else if(user.Type==6) role=Rolepo.gjcwy;
		else if(user.Type==7) role=Rolepo.zjl;
		else role=Rolepo.gly;
		
	}
	
	public String getName(){
		return name;
		
	}
	public String getID(){
		return id;
		
	}
	public String getPassword(){
		return password;
		
	}
	public Rolepo getRole(){
		return role;
		
	}

	public UserAuthorityManagervo geUser() {
		// TODO Auto-generated method stub
		return new UserAuthorityManagervo(name, id, password, type);
	}
}
