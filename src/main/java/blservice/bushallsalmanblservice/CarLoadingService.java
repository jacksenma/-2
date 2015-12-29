package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.bushallsalmanvo.CarLoadingvo;
import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;
import vo.transitmanvo.TransitReceivevo;

public interface CarLoadingService extends Remote {

	/**逻辑层装车单输入
	 * 
	 * @param information
	 * @return boolean
	 * @throws RemoteException
	 * @author 段定
	 */
	public boolean inputLoad(CarLoadingvo information)  throws RemoteException;
	
	/**检验日期输入
	 * 
	 * @param clvo
	 * @param qvo
	 * @return boolean
	 * @throws RemoteException
	 * @author 段定
	 */
	boolean checkDate(CarLoadingvo clvo,QueryOrdervo qvo) throws RemoteException;
	
	/**显示装车单
	 * 
	 * @param car
	 * @return CarLoadingvo
	 * @throws RemoteException
	 * @author 段定
	 */
	CarLoadingvo showInputLoad(String car) throws RemoteException;

    /**修改装车单
     * 
     * @param cv
     * @return boolean
     * @throws RemoteException
     * @author 段定
     */
	boolean modifyCarLoading(CarLoadingvo cv) throws RemoteException;

	
}
