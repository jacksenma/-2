package po.bushallsalmanpo;

import java.io.Serializable;

public enum Zhuangtaipo implements Serializable{

	Integrity,Lost,Hurt;
	
	public String toString(){
		if(this==Integrity) return "完整";
		else if(this==Lost) return "丢失";
		else if(this==Hurt) return "损坏";
		else return null;
		
	}

}
