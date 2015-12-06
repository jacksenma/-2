package vo.financialmanvo;

import java.io.Serializable;

public class CostManagevo implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -5885581065380406423L;
//管理成本
	String date;
	int numOfBusHall;
	public CostManagevo(String d,int n){
		date=d;
		numOfBusHall=n;
	}
//	public String getdate(){
//		return date;
//	}
//	public int getnumOfbBusHall(){
//		return numOfBusHall;
//	}
	
}
