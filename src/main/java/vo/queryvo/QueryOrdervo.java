/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.queryvo;

import data.orderdata.*;
import po.courierpo.CourierOrderpo;
import po.courierpo.ExpressTypepo;
import po.courierpo.PackingTypepo;

import java.io.Serializable;
import java.util.List;
import po.courierpo.ExamineType;

/**
 *
 * @author user
 */
public class QueryOrdervo implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4031887692482029076L;
	private CourierOrderpo co;
    
    public QueryOrdervo(CourierOrderpo co) {
        this.co = co;
    }
    
    public String getSenderName() {
        return co.getSender().name;
    }
    
    public String getConsigneeName() {
        return co.getConsignee().name;
    }
    
    public String getID() {
        return co.getID();
    }
    
    public String getSenderAddress() {
        return co.getSender().address;
    }
    
    public String getConsigneeAddress() {
        return co.getConsignee().address;
    }
    
    public String getConsigneeTelephone() {
        return co.getConsignee().tele;
    }
    
    public String getSenderTelephone() {
        return co.getSender().tele;
    }
    
    public String getSenderUnit(){
        return co.getSender().unit;
    }
    
    public String getConsigneeUnit(){
        return co.getConsignee().unit;
    }
    
    public String getSenderPhone(){
        return co.getSender().phone;
    }
    
    public String getConsigneePhone(){
        return co.getConsignee().phone;
    }
    
    public double getPrice() {
        return co.getPrice();
    }
    
    public int getNumberOfGoods() {
        return co.getGoodMes().num;
    }
    
    public double getGoodsWeight() {
    	return co.getGoodMes().weight;
    }
    
    public double getGoodsVolume() {
    	return co.getGoodMes().volume;
    }
    
    public String getGoodsName() {
        return co.getGoodMes().name;
    }
    
    public PackingTypepo getPackingType() {
        return co.getPackingType();
    }
    
    public ExpressTypepo getExpressType() {
        return co.getExpressType();
    }
    
    public List<String> getHistory() {
        return co.getHistory();
    }
    
    public ExamineType getExamineType() {
        return co.getExamineType();
    }
    
}
