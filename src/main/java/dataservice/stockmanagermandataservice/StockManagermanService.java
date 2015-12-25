package dataservice.stockmanagermandataservice;

import java.util.List;

import po.bushallsalmanpo.SendOrderpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.StoreCheckpo;
import po.stockmanagermanpo.Warningpo;

public interface StockManagermanService {

	public boolean set(Warningpo wpo) throws Exception;
	
	public boolean in(InStoringpo ipo) throws Exception;
	
	public boolean out(OutStoringpo opo) throws Exception;
	
	public boolean initialize() throws Exception;
	
	public InStoringpo[] search() throws Exception;

	public InStoringpo getInstock(String iD);

	public OutStoringpo getOutstock(String iD);

	public String examinein(String qy, String qm, String qd, String zy, String zm, String zd);

	public String examineout(String qy, String qm, String qd, String zy, String zm, String zd);

	public void Daochu()throws Exception;

	public boolean tiaozheng(InStoringpo ipo)throws Exception;
}
