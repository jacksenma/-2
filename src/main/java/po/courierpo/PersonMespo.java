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
public class PersonMespo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6315665737336297922L;
	public final String name;
    public final String address;
    public final String unit;
    public final String tele;
    public final String phone;
    
    public PersonMespo(String name , String address , String unit , String tele
         ,String phone) {
        this.name = name;
        this.address = address;
        this.unit = unit;
        this.tele = tele;
        this.phone = phone;
    }
    
    
}
