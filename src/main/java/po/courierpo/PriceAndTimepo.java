package po.courierpo;

import java.io.Serializable;

import vo.couriervo.Datevo;
import vo.couriervo.GoodsMesvo;
import vo.couriervo.Othervo;
import vo.couriervo.PriceAndTimevo;

public class PriceAndTimepo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5541239185956751689L;
	
	public final String begin;
	
	public final String aim;
	
	public final GoodsMespo goods;
	
	public final ExpressTypepo et;
	
	public final PackingTypepo pt;
	
	public double price;
	
	public Datepo date;
	
	public PriceAndTimepo(PriceAndTimevo v){
		begin = v.begin;
		
		aim = v.aim;
		
		goods = new GoodsMespo(v.goods.number_of_goods , v.goods.weight,
				v.goods.volume , v.goods.name);
		
		if(v.other.packingType == 1) pt = PackingTypepo.Paper;
    	else if(v.other.packingType == 2)
    		pt = PackingTypepo.Bag;
    	else if(v.other.packingType == 3)
    		pt = PackingTypepo.WoodBox;
    	else pt = PackingTypepo.Other;
    	
    	if(v.other.expressType == 1) et = ExpressTypepo.Economic;
    	else if(v.other.expressType == 2)
    		et = ExpressTypepo.Standard;
    	else et = ExpressTypepo.SpecialExpress;
    	
    	
	}

}
