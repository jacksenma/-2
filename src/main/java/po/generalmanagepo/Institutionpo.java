package po.generalmanagepo;

import java.io.Serializable;

import vo.generalmanagervo.Institutionvo;

public class Institutionpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1574341290974004989L;
    int type;
	String name;
	public String ID;
	String leader;
	 
	 public Institutionpo(Institutionvo iv){
		 type = iv.type;
		 name =iv.name;
		 ID=iv.ID;
		 leader=iv.leader;
	 }
	 
	 public Institutionvo getInstitution(){
		 return new Institutionvo(type,name,ID,leader);
	 }
	 
	 public String getID(){
		 return ID;
	 }
}
