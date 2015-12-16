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

	

	@Override
	public boolean modifyInstock(Instockvo instockvo) throws RemoteException {
		return false;
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public boolean modifyOut(Outstockvo outstockvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Instockvo showInstock(String iD) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Outstockvo showOutstock(String iD) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String examinein(String qy, String qm, String qd, String zy, String zm, String zd) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String examineout(String zy, String zm, String zd, String zy2, String zm2, String zd2)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
