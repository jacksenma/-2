package dataservice.generalmanagerdataservice;

public interface OrderService {

	String[] SearchUnchecked();
	
	void approve(String s);
}
