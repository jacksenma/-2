package po.courierpo;

import vo.couriervo.Datevo;

public class ReceiveOrderpo {
	public final String ID;
	
	public String receiver;
	
	public Datepo date;
	
	public ReceiveOrderpo(String s , String name , Datevo d){
		ID = s;
		receiver = name;
		date = new Datepo(d.year , d.month , d.day);
	}
}
