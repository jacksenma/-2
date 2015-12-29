package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.queryvo.QueryOrdervo;

public interface CashRegisterService extends Remote {

	/**收款单输入
	 * 
	 * @param information
	 * @return
	 * @throws RemoteException
	 */
	public boolean inputcash(CashRegistervo information)
			throws RemoteException;

	/**日期输入检验
	 * 
	 * @param cashRegister
	 * @param qovo
	 * @return
	 * @throws RemoteException
	 */
	public boolean checkDate(CashRegistervo cashRegister, QueryOrdervo qovo)
			throws RemoteException;
	
	/**显示收款单
	 * 
	 * @param iD2
	 * @return
	 * @throws RemoteException
	 */
	public CashRegistervo showCash(String iD2) throws RemoteException;
	
	/**修改收款单
	 * 
	 * @param cashRegister
	 * @return
	 * @throws RemoteException
	 */
	boolean modifyCash(CashRegistervo cashRegister) throws RemoteException;
}
