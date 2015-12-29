package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.DriverMespo;
import vo.bushallsalmanvo.DriverMesManagevo;
import vo.bushallsalmanvo.Othervo2;

public interface DriverMesManageService extends Remote {

	
			
    /**司机信息输入
     * 
     * @param drivermesmanage
     * @return
     * @throws RemoteException
     */
	public boolean inputdriver(DriverMesManagevo drivermesmanage)throws RemoteException;
}
