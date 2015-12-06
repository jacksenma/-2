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
public class PriceAndTimevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8770505050324345642L;
	
	public final String begin;
	
	public final String aim;
	
	public final GoodsMesvo goods;
	
	public final Othervo other;
	
	public double price;
	
	public Datevo date;
	
	public PriceAndTimevo(String b, String a, GoodsMesvo g, Othervo o) {
		begin = b;
		aim = a;
		goods = g;
		other = o;
	}
	
}
