package RMI.host;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import businesslogic.administratorbl.UserAuthorityManagerImpl;
import businesslogic.bushallsalmanbl.CarLoadingImpl;
import businesslogic.bushallsalmanbl.CarMesManageImpl;
import businesslogic.bushallsalmanbl.CashRegisterImpl;
import businesslogic.bushallsalmanbl.DriverMesManageImpl;
import businesslogic.bushallsalmanbl.ReceiveSendImpl;
import businesslogic.courierbl.OrderInputImpl;
import businesslogic.courierbl.PriceQueryImpl;
import businesslogic.courierbl.ReceiveMesImpl;
import businesslogic.expressbl.Expressbl;
import businesslogic.financialmanbl.AccountManageImpl;
import businesslogic.financialmanbl.CostManageImpl;
import businesslogic.financialmanbl.SettlementManageImpl;
import businesslogic.financialmanbl.StatisticsListImpl;
import businesslogic.generalmanagerbl.AccountQueryImpl;
import businesslogic.generalmanagerbl.ConstantFormulateImpl;
import businesslogic.generalmanagerbl.OrderExamineImpl;
import businesslogic.generalmanagerbl.SalaryFormulateImpl;
import businesslogic.generalmanagerbl.StaffInstitutionManagerImpl;
import businesslogic.stockmanagermanbl.WarehouseManageImpl;
import businesslogic.transitsalmanbl.TrafficMesManageImpl;
import businesslogic.transitsalmanbl.TransitReceiveImpl;

public class RMIHost {
	
	/**
	 * 
	 */

	private static Map<String, Class<? extends UnicastRemoteObject>> NAMING_MAP =
            new HashMap<String, Class<? extends UnicastRemoteObject>>();

    private static final int PORT = 1099;

    private static boolean inited = false;
	
	
    protected RMIHost() throws RemoteException {
        super();
    }
    
    static {
        NAMING_MAP.put("user-authority-manager-service", 
        		UserAuthorityManagerImpl.class);
        NAMING_MAP.put("test", 
        		TestImpl.class);
        NAMING_MAP.put("car-loading-service", 
        		CarLoadingImpl.class);
        NAMING_MAP.put("car-mes-manage-service", 
        		CarMesManageImpl.class);
        NAMING_MAP.put("cash-register-service", 
        		CashRegisterImpl.class);
        NAMING_MAP.put("driver-mes-manage-service", 
        		DriverMesManageImpl.class);
        NAMING_MAP.put("receive-send-service", 
        		ReceiveSendImpl.class);
        NAMING_MAP.put("order-input-service", 
        		OrderInputImpl.class);
        NAMING_MAP.put("price-query-service", 
        		PriceQueryImpl.class);
        NAMING_MAP.put("receive-mes-service", 
        		ReceiveMesImpl.class);
        NAMING_MAP.put("express-query-service", 
        		Expressbl.class);
        NAMING_MAP.put("account-manage-service", 
        		AccountManageImpl.class);
        NAMING_MAP.put("cost-manage-service", 
        		CostManageImpl.class);
        NAMING_MAP.put("settlement-manage-service", 
        		SettlementManageImpl.class);
        NAMING_MAP.put("statistics-list-service", 
        		StatisticsListImpl.class);
        NAMING_MAP.put("account-query-service", 
        		AccountQueryImpl.class);
        NAMING_MAP.put("constant-formulate-service", 
        		ConstantFormulateImpl.class);
        NAMING_MAP.put("order-examine-service", 
        		OrderExamineImpl.class);
        NAMING_MAP.put("salary-formulate-service", 
        		SalaryFormulateImpl.class);
        NAMING_MAP.put("staff-institution-service", 
        		StaffInstitutionManagerImpl.class);
        NAMING_MAP.put("warehouse-manage-service", 
        		WarehouseManageImpl.class);
        NAMING_MAP.put("traffic-mes-manage-service", 
        		TrafficMesManageImpl.class);
        NAMING_MAP.put("transit-receive-service", 
        		TransitReceiveImpl.class);
    }
    
    public synchronized static void init() throws Exception {
        if (inited) {
            return;
        }
        try {
            LocateRegistry.createRegistry(PORT);
            for (Entry<String, Class<? extends UnicastRemoteObject>> entry : NAMING_MAP.entrySet()) {
                String name = entry.getKey();
                Class<? extends UnicastRemoteObject> clazz = entry.getValue();
                UnicastRemoteObject proxy = clazz.newInstance();
                Naming.rebind(name, proxy);
            }
            inited = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    public static void main(String[] args) {
    	try {
            RMIHost.init();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}