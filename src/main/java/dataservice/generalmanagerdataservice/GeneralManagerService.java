package dataservice.generalmanagerdataservice;

import po.generalmanagepo.Constancypo;
import po.generalmanagepo.Salarypo;

public interface GeneralManagerService {
	
	public boolean writecontancy(Constancypo cp)throws Exception;
	
	public Constancypo getcontancy();
	
}
