/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po.courierpo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import po.otherdatapo.Expresspo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.PriceAndTimevo;

/**
 *
 * @author user
 */
public class CourierOrderpo  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 165712927463596445L;
	final PersonMespo sender , consignee;
	final String ID;
	final  GoodsMespo gm;
	final  double price;
	final PackingTypepo pt;
	final ExpressTypepo et;
	List<String> history;
	public ExamineType ext;
	public final Date date;
	public Datepo receiveDate;
	public String receiver;
	public boolean rece;
    
    public CourierOrderpo(OrderInputvo order, PriceAndTimevo p) {
    	System.out.println(order.sender.name);
    	sender = new PersonMespo(order.sender.name, order.sender.address,
    			order.sender.company, order.sender.telephone, order.sender.phone);
    	
    	consignee = new PersonMespo(order.consignee.name, order.consignee.address,
    			order.consignee.company, order.consignee.telephone, 
    			order.consignee.phone);
    	
    	ID = order.other.ID;
    	
    	gm = new GoodsMespo(order.goods.number_of_goods, order.goods.weight,
    			order.goods.volume, order.goods.name);
    	
    	price = p.price;
    	ext = ExamineType.NOApproval;
    	System.out.println(order.other.packingType + order.other.expressType);
    	if(order.other.packingType == 1) pt = PackingTypepo.Paper;
    	else if(order.other.packingType == 2)
    		pt = PackingTypepo.Bag;
    	else if(order.other.packingType == 3)
    		pt = PackingTypepo.WoodBox;
    	else pt = PackingTypepo.Other;
    	
    	if(order.other.expressType == 1) et = ExpressTypepo.Economic;
    	else if(order.other.expressType == 2)
    		et = ExpressTypepo.Standard;
    	else et = ExpressTypepo.SpecialExpress;
    	Calendar cal = Calendar.getInstance();
    	date = cal.getTime();
    	history = new ArrayList<String>();
    	rece = false;
    }
    
    
    public boolean findOrder() {
        return false;
    }
    
    public PersonMespo getSender() {
        return sender;
    }
    
    public PersonMespo getConsignee() {
        return consignee;
    }
    
    public String getID() {
        return ID;
    }
    
    public GoodsMespo getGoodMes() {
        return gm;
    }
    
    public PackingTypepo getPackingType() {
        return pt;
    }
    
    public ExpressTypepo getExpressType() {
        return et;
    }
    
    public double getPrice() {
        return price;
    }
    
    public List<String> getHistory() {
        return history;
    }
    
    public ExamineType getExamineType() {
        return ext;
    }
    
}
