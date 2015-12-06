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
public enum PackingTypepo implements Serializable {
    Paper , WoodBox , Bag , Other;
    
    public String toString() {
        if(this == Paper) return "纸箱";
        else if(this == WoodBox) return "木箱";
        else if(this == Bag) return "快递袋";
        else return "其他";
    }
}
