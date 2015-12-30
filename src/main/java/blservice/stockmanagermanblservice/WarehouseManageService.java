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
    
	/**入库单输入
	 * 
	 * @param kd
	 * @param wz
	 * @return
	 * @throws RemoteException
	 */
	public boolean in(Kuaidivo kd,Weizhivo wz) throws RemoteException;
	
	/**库存盘点查询
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public StoreCheckvo[] search() throws RemoteException;
	
	/**设置库存报警
	 * 
	 * @param warning
	 * @return
	 * @throws RemoteException
	 */
	public boolean set(WarehouseWarningvo warning) throws RemoteException;
	
	/**库存初始化
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public boolean initialize() throws RemoteException;

	/**出库单输入
	 * 
	 * @param out1
	 * @param zy
	 * @return
	 * @throws RemoteException
	 */
	public boolean out(Outstockvo1 out1,Zhuangyunvo zy)throws RemoteException;

	/**查询入库
	 * 
	 * @param iD
	 * @return
	 * @throws RemoteException
	 */
	public Instockvo showInstock(String iD)throws RemoteException;

	/**修改入库
	 * 
	 * @param instockvo
	 * @return
	 * @throws RemoteException
	 */
	public boolean modifyInstock(Instockvo instockvo)throws RemoteException;

	/**查询出库
	 * 
	 * @param iD
	 * @return
	 * @throws RemoteException
	 */
	public Outstockvo showOutstock(String iD)throws RemoteException;

	/**修改出库
	 * 
	 * @param outstockvo
	 * @return
	 * @throws RemoteException
	 */
	public boolean modifyOut(Outstockvo outstockvo)throws RemoteException;

	/**入库库存查看
	 * 
	 * @param qy
	 * @param qm
	 * @param qd
	 * @param zy
	 * @param zm
	 * @param zd
	 * @return
	 * @throws RemoteException
	 */
	public String examinein(String qy, String qm, String qd, String zy, String zm, String zd)throws RemoteException;

	/**出库库存查看
	 * 
	 * @param zy
	 * @param zm
	 * @param zd
	 * @param zy2
	 * @param zm2
	 * @param zd2
	 * @return
	 * @throws RemoteException
	 */
	public String examineout(String zy, String zm, String zd, String zy2, String zm2, String zd2)throws RemoteException;

	/**导出Excel
	 * 
	 * @throws RemoteException
	 */
	public void daochu()throws RemoteException;
}
