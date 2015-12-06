package po.generalmanagepo;

import java.io.Serializable;

public class Citypo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 165712927463596445L;
	
	String name;
	double dis1;
	double dis2;
	double dis3;
	double amount;
	public Citypo(String n,double d1,double d2,double d3,int amount){
		name = n;
		
		
	}
	public double distance(Citypo c){
		return 0;
	}
	
}
