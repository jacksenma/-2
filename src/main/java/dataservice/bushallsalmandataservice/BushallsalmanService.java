package dataservice.bushallsalmandataservice;

import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.bushallsalmanpo.DriverMespo;
import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;

public interface BushallsalmanService {

	public boolean writeCarloading(CarLoadingpo clpo) throws Exception;
	
	public boolean writeCarMes(CarMespo cmpo)throws Exception;
	
	public boolean writeDriverMes(DriverMespo dmpo)throws Exception;
	
	public boolean writecash(CashReceiveOrderpo cropo)throws Exception;
	
	public boolean writereceive(ReceiveOrderpo ropo)throws Exception;
	
	public boolean writesend(SendOrderpo sopo)throws Exception;

	public CarLoadingpo getLoad();
	
	public CashReceiveOrderpo getCash();

	public ReceiveOrderpo getReceive();

	public SendOrderpo getSend();
	
	
}
