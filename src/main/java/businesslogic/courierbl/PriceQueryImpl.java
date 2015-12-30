package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import RMI.host.HostLog;
import blservice.courierblservice.PriceQueryService;
import businesslogic.generalmanagerbl.ConstantFormulateImpl;
import data.orderdata.OrderIO;
import dataservice.courierdataservice.CourierService;
import po.courierpo.ExpressTypepo;
import po.courierpo.PackingTypepo;
import po.courierpo.PriceAndTimepo;
import vo.couriervo.Datevo;
import vo.couriervo.PriceAndTimevo;
import vo.generalmanagervo.Constancyvo;

public class PriceQueryImpl extends UnicastRemoteObject implements PriceQueryService {

	
	public PriceQueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceAndTimevo getPriceAndTime(PriceAndTimevo p) throws RemoteException {
		// TODO Auto-generated method stub
		ConstantFormulateImpl cfi = new ConstantFormulateImpl();
		Constancyvo csvo = cfi.showConstancy();
		p.price = csvo.standardprice;
		PriceAndTimepo ptpo = new PriceAndTimepo(p);
		if(ptpo.pt == PackingTypepo.WoodBox) p.price *= 2.3;
		else if(ptpo.pt == PackingTypepo.Bag) p.price *= 1.6;
		else if(ptpo.pt == PackingTypepo.Paper) p.price *= 1.3;
		if(ptpo.goods.weight > 5) p.price += (ptpo.goods.weight - 5) * 0.3;
		if(ptpo.goods.volume > 2) p.price += (ptpo.goods.volume - 2) * 0.2;
		if(ptpo.et == ExpressTypepo.Economic) p.price = 
				p.price / 23 * 18;
		else if(ptpo.et == ExpressTypepo.SpecialExpress) p.price =
				p.price / 23 * 25;
		List<String> ls = cfi.getcity();
		for(int i = 0 ; i < ls.size(); i++){
			String s = ls.get(i);
			String split1 []=s.split("      ");
			String split2 []=split1[1].split("     ");
			if(p.aim.substring(0, 2).equals(split1[0]) &&
					p.begin.substring(0, 2).equals(split2[1]))
				p.price *= Double.parseDouble(split1[2]);
			else if(p.begin.substring(0, 2).equals(split1[0]) &&
					p.aim.substring(0, 2).equals(split2[1]))
				p.price *= Double.parseDouble(split1[2]);
		}
		
//		CourierService cs = new OrderIO();
//		ptpo = cs.query(ptpo);
//		p.price = ptpo.price;
        p.date = new Datevo();
        HostLog.addMes("查询订单：\n 出发地：" + p.begin + " 目的地：" + p.aim
        		+ "\n 价格：" + p.price + " 时间：" + p.date);
		return p;
	}

}
