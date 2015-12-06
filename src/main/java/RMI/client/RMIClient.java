package RMI.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import blservice.administratorblservice.UserAuthorityManagerService;
import blservice.bushallsalmanblservice.CarLoadingService;
import blservice.bushallsalmanblservice.CarMesManageService;
import blservice.bushallsalmanblservice.CashRegisterService;
import blservice.bushallsalmanblservice.DriverMesManageService;
import blservice.bushallsalmanblservice.ReceiveSendService;
import blservice.courierblservice.OrderInputService;
import blservice.courierblservice.PriceQueryService;
import blservice.courierblservice.ReceiveMesService;
import blservice.financialmanblservice.AccountManageService;
import blservice.financialmanblservice.CostManageService;
import blservice.financialmanblservice.SettlementManageService;
import blservice.financialmanblservice.StatisticsListService;
import blservice.generalmanagerblservice.AccountQueryService;
import blservice.generalmanagerblservice.ConstantFormulateService;
import blservice.generalmanagerblservice.OrderExamineService;
import blservice.generalmanagerblservice.SalaryFormulateService;
import blservice.generalmanagerblservice.StaffInstitutionManagerService;
import blservice.queryblservice.QueryService;
import blservice.stockmanagermanblservice.WarehouseManageService;
import blservice.transitsalmanblservice.TrafficMesManageService;
import blservice.transitsalmanblservice.TransitReceiveService;



public class RMIClient {
	
	private static final String IP = "localhost"; //Can be read from config file

    private static boolean inited = false;
    
    private static UserAuthorityManagerService uams;
    
    private static CarLoadingService cls;
    
    private static CarMesManageService cmms;
    
    private static CashRegisterService crs;
    
    private static DriverMesManageService dmms;
    
    private static ReceiveSendService rss;
    
    private static OrderInputService ois;
    
    private static PriceQueryService pqs;
    
    private static ReceiveMesService rms;
    
    private static AccountManageService ams;
    
    private static QueryService qs;
    
    private static CostManageService cms;
    
    private static SettlementManageService sms;
    
    private static StatisticsListService sls;
    
    private static AccountQueryService aqs;
    
    private static ConstantFormulateService cfs;
    
    private static OrderExamineService oes;
    
    private static SalaryFormulateService sfs;
    
    private static StaffInstitutionManagerService sims;
    
    private static WarehouseManageService wms;
    
    private static TrafficMesManageService tmms;
    
    private static TransitReceiveService trs;
    
    private static Test t;
	
    public synchronized static void init() throws Exception {
        if (inited) {
            return;
        }

        try {
            initObjects();
            inited = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    private static void initObjects() throws MalformedURLException, RemoteException, NotBoundException {
        String urlPrefix = "rmi://" + IP + "/";
        uams = (UserAuthorityManagerService)Naming.lookup(urlPrefix + 
        		"user-authority-manager-service");
        
        cls = (CarLoadingService)Naming.lookup(urlPrefix +
        		"car-loading-service");
        
        cmms = (CarMesManageService)Naming.lookup(urlPrefix +
        		"car-mes-manage-service");
        
        crs = (CashRegisterService)Naming.lookup(urlPrefix + 
        		"cash-register-service");
        
        dmms = (DriverMesManageService)Naming.lookup(urlPrefix + 
        		"driver-mes-manage-service");
        
        rss = (ReceiveSendService)Naming.lookup(urlPrefix + 
        		"receive-send-service");
        
        ois = (OrderInputService)Naming.lookup(urlPrefix + 
        		"order-input-service");
        
        pqs = (PriceQueryService)Naming.lookup(urlPrefix + 
        		"price-query-service");
        
        rms = (ReceiveMesService)Naming.lookup(urlPrefix +
        		"receive-mes-service");
        
        qs = (QueryService)Naming.lookup(urlPrefix + 
        		"express-query-service");
        
        ams = (AccountManageService)Naming.lookup(urlPrefix +
        		"account-manage-service");
        
        cms = (CostManageService)Naming.lookup(urlPrefix +
        		"cost-manage-service");
        
        sms = (SettlementManageService)Naming.lookup(urlPrefix +
        		"settlement-manage-service");
        
        sls = (StatisticsListService)Naming.lookup(urlPrefix +
        		"statistics-list-service");
        
        aqs = (AccountQueryService)Naming.lookup(urlPrefix +
        		"account-query-service");
        
        cfs = (ConstantFormulateService)Naming.lookup(urlPrefix +
        		"constant-formulate-service");	
        
        oes = (OrderExamineService)Naming.lookup(urlPrefix +
        		"order-examine-service");
        
        sfs = (SalaryFormulateService)Naming.lookup(urlPrefix +
        		"salary-formulate-service");
        
        sims = (StaffInstitutionManagerService)Naming.lookup(urlPrefix +
        		"staff-institution-service");
        
        wms = (WarehouseManageService)Naming.lookup(urlPrefix +
        		"warehouse-manage-service");
        
        tmms = (TrafficMesManageService) Naming.lookup(urlPrefix +
        		"traffic-mes-manage-service");
        
        trs = (TransitReceiveService)Naming.lookup(urlPrefix +
        		"transit-receive-service");
        
        t = (Test)Naming.lookup(urlPrefix + "test");
    }
    
    public static UserAuthorityManagerService getUserAuthorityManagerService() {
    	return uams;
    }
    
    public static Test test(){
    	return t;
    }
    
    public static CarLoadingService getCarLoadingService(){
    	return cls;
    }
    
    public static CarMesManageService getCarMesManageService(){
    	return cmms;
    }
    
    public static CashRegisterService getCashRegisterService(){
    	return crs;
    }
    
    public static DriverMesManageService getDriverMesManageService(){
    	return dmms;
    }
    
    public static ReceiveSendService getReceiveSendService(){
    	return rss;
    }
    
    public static OrderInputService getOrderInputService(){
    	return ois;
    }
    
    public static PriceQueryService getPriceQueryService(){
    	return pqs;
    }
    
    public static ReceiveMesService getReceiveMesService(){
    	return rms;
    }
    
    public static AccountManageService getAccountManageService(){
    	return ams;
    }
    
    public static QueryService getQueryService(){
    	return qs;
    }
    
    public static CostManageService getCostManageService(){
    	return cms;
    }
    
    public static SettlementManageService getSettlementManageService(){
    	return sms;
    }
    
    public static StatisticsListService getStatisticsListService(){
    	return sls;
    }
    
    public static AccountQueryService getAccountQueryService(){
    	return aqs;
    }
    
    public static ConstantFormulateService getConstantFormulateService(){
    	return cfs;
    }
    
    public static OrderExamineService getOrderExamineService(){
    	return oes;
    }
    
    public static SalaryFormulateService getSalaryFormulateService(){
    	return sfs;
    }
    
    public static StaffInstitutionManagerService getStaffInstitutionManagerService(){
    	return sims;
    }
    
    public static WarehouseManageService getWarehouseManageService(){
    	return wms;
    }
    
    public static TrafficMesManageService getTrafficMesManageService(){
    	return tmms;
    }
    
    public static TransitReceiveService getTransitReceiveService(){
    	return trs;
    }
    
    public static void main(String [] args) throws Exception{
    	RMIClient.init();
    	UserAuthorityManagerService service = 
    			RMIClient.getUserAuthorityManagerService();
    	service.findUser(2);
    }
}