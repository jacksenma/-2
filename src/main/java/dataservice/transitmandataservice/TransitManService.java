package dataservice.transitmandataservice;

import po.transitmanpo.TrafficMespo;
import po.transitmanpo.TransitReceiveOrderpo;

public interface TransitManService {
	
	boolean receiveOrderWrite (TransitReceiveOrderpo po) throws Exception;
	
	boolean addHistory(String ID , String h) throws Exception;
	
	boolean TrafficOrderWrite(TrafficMespo tmpo) throws Exception;

}
