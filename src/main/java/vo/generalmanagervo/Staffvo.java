package vo.generalmanagervo;

import java.io.Serializable;

public class Staffvo extends StaffInstitutionManagevo implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1342558994390365715L;
	public String id;
	public String name;
	public String worktime;       //yyyy-mm-dd
	public String workunit;
	public String role;
	  
	 public Staffvo(String n,String i,String wt,String wu,String r){
	    	name = n;
	    	id = i;
	    	worktime = wt;
	    	workunit = wu;
	    	role = r;
	    }
  public String getName(){
  	return name;
  }
  public String getID(){
  	return id;
  }
  public String getWorktime(){ 
  	return worktime;
  }
  
  public String role(){
  	return role;
  }
}
