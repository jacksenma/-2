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
public class GoodsMesvo implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5758436740344470196L;
	/**
	 * 
	 */
	public final int number_of_goods;
    public final String name;
    public final double weight;
    public final double volume;
    
    public GoodsMesvo(int num, String n, double w, double v){
        number_of_goods = num;
        name = n;
        weight = w;
        volume = v;
    }
    
}
