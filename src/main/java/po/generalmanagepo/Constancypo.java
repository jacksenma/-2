package po.generalmanagepo;

import java.io.Serializable;

import vo.generalmanagervo.Cityvo;
import vo.generalmanagervo.Constancyvo;

public class Constancypo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2485145370012664226L;
	double bushalldistance;
	double economicprice;               //18:23:25
	double standardprice;
	double expressPrice;
    Citypo[] city;
    
	  public Constancypo(Constancyvo cv) {
		// TODO Auto-generated constructor stub
	bushalldistance = cv.bushalldistance;
	standardprice = cv.standardprice;
	economicprice = cv.standardprice/23*18;
	expressPrice = cv.standardprice/23*25;
	city=cv.city;
	  }

	  public Constancyvo getcontancy(){
		  return new Constancyvo(bushalldistance,standardprice,city);
	  }
	  
}
