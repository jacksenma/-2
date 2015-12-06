package vo.generalmanagervo;

import java.io.Serializable;

import po.generalmanagepo.Citypo;

public class Constancyvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4844889841029455906L;
	
	public double bushalldistance;
    public double standardprice;
    public Citypo[] city;
    
    public Constancyvo(double d1,double d2,Citypo[] c){
    		bushalldistance=d1;
    		standardprice=d2;
    		city=c;
    }
}
