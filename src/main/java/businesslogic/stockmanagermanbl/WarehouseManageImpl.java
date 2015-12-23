package businesslogic.stockmanagermanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import blservice.courierblservice.OrderInputService;
import blservice.stockmanagermanblservice.WarehouseManageService;
import businesslogic.courierbl.OrderInputImpl;
import data.institutiondata.BusinessHall;
import data.warehousedata.Storing;
import dataservice.bushallsalmandataservice.BushallsalmanService;
import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.SendOrderpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.StoreCheckpo;
import po.stockmanagermanpo.Warningpo;
import vo.generalmanagervo.Staffvo;
import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.Outstockvo;
import vo.stocmanagermanvo.Outstockvo1;
import vo.stocmanagermanvo.StoreCheckvo;
import vo.stocmanagermanvo.WarehouseWarningvo;
import vo.stocmanagermanvo.Weizhivo;
import vo.stocmanagermanvo.Zhuangyunvo;

public class WarehouseManageImpl extends UnicastRemoteObject implements WarehouseManageService {

	public WarehouseManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean initialize() throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try{
		if(sms.initialize())
			return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
	}

	public boolean set(WarehouseWarningvo warning) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.set(new Warningpo(warning)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean in(Kuaidivo kd,Weizhivo wz) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		OrderInputImpl ois = new OrderInputImpl();
		try {
			if(sms.in(new InStoringpo(kd,wz))){
				ois.writeHistory(kd.bianhao, "已在中转中心"+wz.zhongzhuan+"入库");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean out(Outstockvo1 out1,Zhuangyunvo zy) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		OrderInputImpl ois = new OrderInputImpl();
		try {
			if(sms.out(new OutStoringpo(out1,zy))){
				ois.writeHistory(out1.bianhao, "已在中转中心"+out1.zhongzhuan+"出库");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	public StoreCheckvo[] search() throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			InStoringpo[] sp =sms.search();
			if(sp==null) return null;
			else{
				StoreCheckvo[] sv=new StoreCheckvo[sp.length];
				for(int i=0;i<sp.length;i++){
					StoreCheckvo s = sp[i].getHuo();
					sv[i]= s;
				}
				return sv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Instockvo showInstock(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		InStoringpo crpo = sms.getInstock(ID);
		if(crpo==null){
			return null;
		}
		else return crpo.getInstock();
		
	}


	@Override
	public boolean modifyInstock(Instockvo instockvo) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.in(new InStoringpo(instockvo.kuaidi,instockvo.weizhi)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public Outstockvo showOutstock(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		OutStoringpo crpo = sms.getOutstock(ID);
		if(crpo==null){
			return null;
		}
		else return crpo.getOutstock();
		
	}


	@Override
	public boolean modifyOut(Outstockvo outstockvo) {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.out(new OutStoringpo(outstockvo.out1,outstockvo.zy)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public String examinein(String qy, String qm, String qd,String zy,String zm,String zd) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		String inshu=sms.examinein(qy,qm,qd,zy,zm,zd);
		return inshu;
	}


	@Override
	public String examineout(String qy,String qm,String qd,String zy, String zm, String zd) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		String outshu=sms.examineout(qy,qm,qd,zy,zm,zd);
		return outshu;
	}
	
	

}
