package po.generalmanagepo;

import java.io.Serializable;
import java.util.List;

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
    List<String> city;
    
	  public Constancypo(Constancyvo cv) {
		// TODO Auto-generated constructor stub
	bushalldistance = cv.bushalldistance;
	standardprice = cv.standardprice;
	economicprice = cv.standardprice/23*18;
	expressPrice = cv.standardprice/23*25;
	  }

	  public Constancyvo getcontancy(){
		  return new Constancyvo(bushalldistance,standardprice);
	  }
	  
}
