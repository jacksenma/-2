package vo.generalmanagervo;

import java.io.Serializable;

public class Institutionvo extends StaffInstitutionManagevo implements Serializable {
       /**
	 * 
	 */
	private static final long serialVersionUID = 7696938678838677854L;
	public String name;
	public String ID;
    public String leader;
    public int type;
    
    public Institutionvo(int t,String n,String I,String l){
    	   name=n;
    	   ID=I;
    	   leader=l;
           type=t;
       }
}

