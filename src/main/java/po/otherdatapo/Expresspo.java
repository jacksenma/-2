package po.otherdatapo;

import po.courierpo.CourierOrderpo;

public class Expresspo {
    String number;
    
    public Expresspo(String s) {
        number = s;
        System.out.println(s);
    }

	public String getID(){
        return number;
    }
}
