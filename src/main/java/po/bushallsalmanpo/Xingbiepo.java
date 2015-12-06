package po.bushallsalmanpo;

import java.io.Serializable;

public enum Xingbiepo implements Serializable{

	

	Man ,Woman;
	
	public String toString(){
		if(this==Man) return "男";
		else if(this==Woman) return "女";
		else return null;
	}
}
