package dataservice.generalmanagerdataservice;

import java.util.List;

import po.generalmanagepo.Constancypo;
import po.generalmanagepo.Salarypo;

public interface GeneralManagerService {
	
	public boolean writecontancy(Constancypo cp)throws Exception;
	
	public Constancypo getcontancy();
	
	public void addcity(String s);
	
	public List<String> getcity();
 
    public void deletecity(String s);
    
    public void modifycity(String oldc,String newc);

}
