package blservice.stockmanagermanblservice;

import java.rmi.RemoteException;

import po.stockmanagermanpo.InStoringpo;
import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.Outstockvo;
import vo.stocmanagermanvo.Outstockvo1;
import vo.stocmanagermanvo.StoreCheckvo;
import vo.stocmanagermanvo.WarehouseWarningvo;
import vo.stocmanagermanvo.Weizhivo;
import vo.stocmanagermanvo.Zhuangyunvo;

public class WarehouseManageService_Stub implements WarehouseManageService{

	public InStoringpo out() {
		// TODO Auto-generated method stub
		System.out.println("进行出库");
		return null;
	}

	public InStoringpo in() {
		// TODO Auto-generated method stub
		System.out.println("进行入库");
		return null;
	}

	public InStoringpo search(WarehouseWarningvo information) {
		// TODO Auto-generated method stub
		System.out.println("库存查询");
		return null;
	}

	public int set() {
		// TODO Auto-generated method stub
		System.out.println("设置警戒比例");
		return 0;
	}

	public boolean initialize() {
		// TODO Auto-generated method stub
		System.out.println("库存初始化");
		return true;
	}

	public boolean set(WarehouseWarningvo warning) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean in(Instockvo in) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean in(Kuaidivo kd, Weizhivo wz) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean out(Outstockvo out) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean out(Outstockvo1 out1, Zhuangyunvo zy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public StoreCheckvo[] search() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
