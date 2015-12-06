package po.otherdatapo;

import java.io.Serializable;

import vo.generalmanagervo.Staffvo;

public class Staffpo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7966428615692475363L;
	String id;
	String name;
	String worktime;       //yyyy-mm-dd
	String workunit;
	public String role;
	
	public Staffpo(Staffvo sv) {
		// TODO Auto-generated constructor stub
		id=sv.id;
		name=sv.name;
		worktime=sv.worktime;
		workunit=sv.workunit;
		role=sv.role;
	}

	public Staffvo getStaff() {
		// TODO Auto-generated method stub
		return (new Staffvo(name,id,worktime,workunit,role));
	}

	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
