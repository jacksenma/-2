/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po.courierpo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class GoodsMespo implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -7049906434975017252L;
	public final int num;
    public final double weight;
    public final double volume;
    public final String name;
    
    public GoodsMespo(int num , double weight , double volume , String name) {
        this.name = name;
        this.num = num;
        this.volume = volume;
        this.weight = weight;
    }
    
}
