package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public interface CarMesManageService extends Remote{

	/**车辆信息输入
	 * 
	 * @param information
	 * @return
	 * @throws RemoteException
	 */
	public boolean inputVehicle(CarMesManagevo information) throws RemoteException;

	/**检验车牌号是否重复
	 * 
	 * @param string
	 * @return
	 * @throws RemoteException
	 */
	public boolean AllSearch(String string)throws RemoteException;
}
