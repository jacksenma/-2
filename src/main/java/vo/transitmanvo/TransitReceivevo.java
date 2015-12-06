package vo.transitmanvo;

import java.io.Serializable;

import vo.couriervo.Datevo;

public class TransitReceivevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6169812166390085157L;

	public final String cenID;
	
	public final Datevo date;
	
	public final String ID;
	
	public final String start;
	
	public final int type;
	
	public TransitReceivevo(String c , Datevo d , String i , String s , int t)
	{
		cenID = c;
		date = d;
		ID = i;
		start = s;
		type = t;
	}
}
