package dataservice.otherdataservice;

import data.orderdata.OrderIO;
import po.courierpo.CourierOrderpo;
import po.otherdatapo.Expresspo;

public interface ExpressService {
    
    public CourierOrderpo search(String ID) throws Exception ;

}
