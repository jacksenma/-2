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
public enum ExpressTypepo  implements Serializable{
    Economic , Standard , SpecialExpress;
    
    public String toString() {
        if(this == Economic) return "经济快递";
        else if(this == Standard) return "标准快递";
        else return "特快";
    }
}
