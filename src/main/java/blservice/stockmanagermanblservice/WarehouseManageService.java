package blservice.stockmanagermanblservice;

import java.rmi.Remote;
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

public interface WarehouseManageService extends Remote {
    
	//入库单输入
	public boolean in(Kuaidivo kd,Weizhivo wz) throws RemoteException;
	
	//库存盘点查询
	public StoreCheckvo[] search() throws RemoteException;
	
	//设置库存报警
	public boolean set(WarehouseWarningvo warning) throws RemoteException;
	
	//库存初始化
	public boolean initialize() throws RemoteException;

	//出库单输入
	public boolean out(Outstockvo1 out1,Zhuangyunvo zy)throws RemoteException;

	//
	public Instockvo showInstock(String iD)throws RemoteException;

	public boolean modifyInstock(Instockvo instockvo)throws RemoteException;

	public Outstockvo showOutstock(String iD)throws RemoteException;

	public boolean modifyOut(Outstockvo outstockvo)throws RemoteException;

	public String examinein(String qy, String qm, String qd, String zy, String zm, String zd)throws RemoteException;

	public String examineout(String zy, String zm, String zd, String zy2, String zm2, String zd2)throws RemoteException;

	public void daochu()throws RemoteException;
}
