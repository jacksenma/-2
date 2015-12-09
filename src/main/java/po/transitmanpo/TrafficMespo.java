package po.transitmanpo;

import java.io.Serializable;
import java.util.List;

import po.courierpo.Datepo;
import vo.transitmanvo.TrafficMesManagevo;

public class TrafficMespo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2059429064400347567L;
	
	public final Datepo date;
	
	public final String cenID;
    
    public final String begin;
    
    public final String target;
    
    public final String tafficID;
    
    public final String counter;
    
    public final String person;
    
    public String cargoman;
    
    public List<String> allID;
    
    public final TafficType tt;
    
    public TrafficMespo(TrafficMesManagevo tvo){
    	date = new Datepo(tvo.date.year , tvo.date.month
    			 , tvo.date.day);
    	cenID = tvo.cenID;
    	allID = tvo.allID;
    	begin = tvo.begin;
    	target = tvo.target;
    	tafficID = tvo.tafficID;
    	counter = tvo.counter;
    	person = tvo.person;
    	if(tvo.tafficType == 1) tt = TafficType.Plane;
    	else if(tvo.tafficType == 2) tt = TafficType.Train;
    	else tt = TafficType.Car;
    	
    }

}
