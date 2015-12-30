package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.CashRegistervo;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Sendvo;
import vo.queryvo.QueryOrdervo;

public interface ReceiveSendService extends Remote {

	/**接收单输入
	 * 
	 * @param receive
	 * @return
	 * @throws RemoteException
	 */
	public boolean inputreceive(Receivevo receive)
			throws RemoteException;
	
	/**派件单输入
	 * 
	 * @param send
	 * @return
	 * @throws RemoteException
	 */
	public boolean inputsend(Sendvo send)
			throws RemoteException;

	/**收件单日期输入检验
	 * 
	 * @param receive1
	 * @param qovo
	 * @return
	 * @throws RemoteException
	 */
	public boolean checkDate(Receivevo1 receive1, QueryOrdervo qovo)
	        throws RemoteException;

	/**派件单日期输入检验
	 * 
	 * @param send
	 * @param qovo
	 * @return
	 * @throws RemoteException
	 */
	public boolean checkDate(Sendvo send, QueryOrdervo qovo)
	        throws RemoteException;

	/**显示收件单信息
	 * 
	 * @param iD
	 * @return
	 * @throws RemoteException
	 */
	public Receivevo showReceive(String iD)
	        throws RemoteException;

	/**修改收件单信息
	 * 
	 * @param receive
	 * @return
	 * @throws RemoteException
	 */
	public boolean modifyReceive(Receivevo receive)
	        throws RemoteException;

	/**显示派件单信息
	 * 
	 * @param iD
	 * @return
	 * @throws RemoteException
	 */
	public Sendvo showSend(String iD)
	        throws RemoteException;

	/**修改派件单信息
	 * 
	 * @param sendvo
	 * @return
	 * @throws RemoteException
	 */
	public boolean modifySend(Sendvo sendvo)
	        throws RemoteException;
}
