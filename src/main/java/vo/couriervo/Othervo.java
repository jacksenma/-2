/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.couriervo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Othervo  implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5298450624319722317L;
	/**
	 * 
	 */
	public final int expressType;
    public final int packingType;
    public final String ID;
    
    public Othervo(int e, int p, String ID){
        expressType = e;
        packingType = p;
        this.ID = ID;
    }
    
}
