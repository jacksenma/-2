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
public class Datevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2164454993392325845L;
	
	public int year = 0;
	
	public int month = 0;
	
	public int day = 0;
	
	public Datevo(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public Datevo() {
		
	}
	
	public String toString() {
		if(year == 0) return 0 + "";
		return year + "年 " + month + "月 " + day + "日";
	}
    
}
