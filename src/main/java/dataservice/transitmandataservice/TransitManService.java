package dataservice.transitmandataservice;

import po.transitmanpo.TransitReceiveOrderpo;

public interface TransitManService {
	
	boolean receiveOrderWrite (TransitReceiveOrderpo po) throws Exception;
	
	boolean addHistory(String ID , String h) throws Exception;

}
