package dataservice.courierdataservice;

import po.courierpo.CourierOrderpo;
import po.courierpo.PriceAndTimepo;
import po.courierpo.ReceiveOrderpo;

public interface CourierService {
	
	public boolean writeOrder(CourierOrderpo cpo) throws Exception;
	
//	public static boolean writeData(OrderInputvo o, PriceAndTimevo p){
//		try {
//        	if(OrderIO.write(new CourierOrderpo(o , p)))
//        		return true;
//        } catch(Exception e){
//        	e.printStackTrace();
//        }
//		return false;
//	}
	
	public PriceAndTimepo query(PriceAndTimepo p);
	
	public boolean writeReceive(ReceiveOrderpo r);

	public CourierOrderpo search(String id) throws Exception;

	boolean addHistory(String ID , String h) throws Exception;
}
