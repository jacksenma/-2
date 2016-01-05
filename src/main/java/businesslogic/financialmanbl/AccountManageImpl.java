package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import RMI.host.HostLog;
import blservice.financialmanblservice.AccountManageService;
import data.accountdata.AccountIO;
import data.institutiondata.BusinessHall;
import data.institutiondata.Institution;
import data.reformdata.PaymentListIO;
import data.reformdata.RecieveListIO;
import data.staffdata.Staff;
import data.warehousedata.Storing;
import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.InitMespo;
import po.generalmanagepo.Institutionpo;
import po.otherdatapo.Staffpo;
import po.stockmanagermanpo.Warningpo;
import vo.bushallsalmanvo.CarMesManagevo;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.InitMesvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;
import vo.stocmanagermanvo.WarehouseWarningvo;

public class AccountManageImpl extends UnicastRemoteObject implements AccountManageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7115447212691987826L;

	public AccountManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManagevo showAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo addAcount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	public AccountManagevo changeAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo Initialize(String jigou, ArrayList<String> renyuan, ArrayList<String> cheliang, int kucun,
			String accountname, int money) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getOrder(AccountManagevo amvo)  {
//		return false;
		FinancialmanService fs=new AccountIO();
		 try {
//				System.out.println("sdweretr");
         	if(fs.addAccount(new Accountpo(amvo)))
         		HostLog.addMes("新增银行账户： "+"\n"+"账户名称： "+amvo.accountName+"\n"+"初始金额： "+amvo.money+"\n");
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         return false;
		// TODO Auto-generated method stub
//		AccountManageService am=new 
	}

	@Override
	public boolean getOrder(InitMesvo ivo) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		 try {
//				System.out.println("sdweretr");
        	if(fs.addInitMes(new InitMespo(ivo)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public AccountUservo findUsers(AccountMesvo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs = new AccountIO();
		 
		   
	       Accountpo co;
			try {
				co = fs.find(qvo.getName());
				if(co == null) return null;
				HostLog.addMes("查找银行账户"+"\n");
		        return new AccountUservo(co);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	   
		
		
		
	}

	@Override
	public AccountManagevo[] searchAll() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService as=new AccountIO();
		Accountpo[] up;
		try {
			up = as.AllSearch();
			if(up==null)  return null;
			else{
				HostLog.addMes("查找所有银行账户"+"\n");
				AccountManagevo[] uv = new AccountManagevo[up.length];
				for(int i=0;i<up.length;i++){
					AccountManagevo s = up[i].geUser();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public RecieveListvo[] searchRe(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new RecieveListIO();
		CashReceiveOrderpo[] rp;
		try {
			rp = fs.SearchRe(text);
			if(rp==null)  return null;
			else{HostLog.addMes("查找收款单信息"+"\n");
				RecieveListvo[] rv = new RecieveListvo[rp.length];
				for(int i=0;i<rp.length;i++){
					RecieveListvo s = rp[i].getRecieveList();
					rv[i]= s;
				}
				return rv;
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public PaymentInputvo[] searchPay(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new PaymentListIO();
		CostOrderpo[] rp;
		try {
			rp = fs.SearchPay(text);
			if(rp==null)  return null;
			else{HostLog.addMes("查找付款单信息"+"\n");
				PaymentInputvo[] rv = new PaymentInputvo[rp.length];
				for(int i=0;i<rp.length;i++){
					PaymentInputvo s = rp[i].getPaymentList();
					rv[i]= s;
				}
				return rv;
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountManagevo[] searchMo(String text) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		Accountpo[] ap;
		try {
			ap = fs.MoSearch(text);
			if(ap==null)  return null;
			else{
				HostLog.addMes("模糊查找"+"关键字为"+text+" 的银行账户"+"\n");
				AccountManagevo[] av = new AccountManagevo[ap.length];
				for(int i=0;i<ap.length;i++){
					
					AccountManagevo s = ap[i].geUser();
					av[i]= s;
				}
				return av;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteAccount(String name) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		 try {
				
         	if(fs.deleteAcc(name)){
         		HostLog.addMes("删除账户名称为"+name+" 的银行账户"+"\n");
         		return true;
         	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         return false;
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new AccountIO();
		try {
			fs.writeInit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int getZong(int parseInt, String[] jqPay, String[] jqRe,int jqRecount,int jqPaycount) throws RemoteException {
		// TODO Auto-generated method stub
		int Re=0;
    	for(int w=0;w<jqRecount;w++){

    		Re+=Integer.parseInt(jqRe[w]);
    	}

    	int Pay=0;
    	for(int qw=0;qw<jqPaycount;qw++){
    		Pay+=Integer.parseInt(jqPay[qw]);
    	}
    	int result=parseInt+Re-Pay;
    	return result;
	}

	@Override
	public boolean writeInitAccount() throws RemoteException {
		
		try {
			FinancialmanService fs=new AccountIO();
			Accountpo[] ap;
			ap = fs.AllSearch();
			if(ap.length==0)  return false;
			else{
				
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitAccount(ap[i]);
					if(a==false)
						return false;
				}
				HostLog.addMes("进行期初银行账户信息设置"+"\n");
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public AccountManagevo[] searchAllInitAccount() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService as=new AccountIO();
		Accountpo[] up;
		try {
			up = as.AllSearchInitAccount();
			if(up==null)  return null;
			else{
				AccountManagevo[] uv = new AccountManagevo[up.length];
				for(int i=0;i<up.length;i++){
					AccountManagevo s = up[i].geUser();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean writeInitJigou() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			Institution fs=new Institution();
			Institutionpo[] ap;
			ap = fs.searchAll();
			System.out.println(ap.length);
			if(ap.length==0)  
				return false;
			else{
				
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitAccount(ap[i]);
					if(a==false)
						return false;
				}
				HostLog.addMes("进行期初机构信息设置"+"\n");
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean writeInitRenyuan() throws RemoteException {
		// TODO Auto-generated method stub
		
		
		try {
			Staff fs=new Staff();
			Staffpo[] ap;
			ap = fs.searchAll();
			if(ap.length==0)  return false;
			else{
				
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitRenyuan(ap[i]);
					if(a==false)
						return false;
				}
				HostLog.addMes("进行期初人员信息设置"+"\n");
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean writeInitKucun() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			Storing fs=new Storing();
			Warningpo[] ap;
			ap = fs.AllSearch();
			if(ap.length==0)  return false;
			else{
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitKucun(ap[i]);
					if(a==false)
						return false;
				}
				HostLog.addMes("进行期初库存信息设置"+"\n");
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean writeInitCheliang() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			BusinessHall fs=new BusinessHall();
			CarMespo[] ap;
			ap = fs.AllSearch();
			if(ap.length==0)  return false;
			else{
				for(int i=0;i<ap.length;i++){
					boolean a=fs.addInitCheliang(ap[i]);
					if(a==false)
						return false;
				}
				HostLog.addMes("进行期初车辆信息设置"+"\n");
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Institutionvo[] searchAllInitJigou() throws RemoteException {
		// TODO Auto-generated method stub
		Institution as=new Institution();
		Institutionpo[] up;
		try {
			up = as.AllSearchInitAccount();
			if(up==null)  return null;
			else{
				Institutionvo[] uv = new Institutionvo[up.length];
				for(int i=0;i<up.length;i++){
					Institutionvo s = up[i].getInstitution();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Staffvo[] searchAllInitRenyuan() throws RemoteException {
		// TODO Auto-generated method stub
		Staff as=new Staff();
		Staffpo[] up;
		try {
			up = as.AllSearchInitAccount();
			if(up==null)  return null;
			else{
				Staffvo[] uv = new Staffvo[up.length];
				for(int i=0;i<up.length;i++){
					Staffvo s = up[i].getStaff();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CarMesManagevo[] searchAllInitCheliang() throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall as=new BusinessHall();
		CarMespo[] up;
		try {
			up = as.AllSearchInitAccount();
			if(up==null)  return null;
			else{
				CarMesManagevo[] uv = new CarMesManagevo[up.length];
				for(int i=0;i<up.length;i++){
					CarMesManagevo s = up[i].getCarMes();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WarehouseWarningvo[] searchAllInitKucun() throws RemoteException {
		// TODO Auto-generated method stub
		Storing as=new Storing();
		Warningpo[] up;
		try {
			up = as.AllSearchInitkucun();
			if(up==null)  return null;
			else{
				WarehouseWarningvo[] uv = new WarehouseWarningvo[up.length];
				for(int i=0;i<up.length;i++){
					WarehouseWarningvo s = up[i].getMes();
					uv[i]= s;
				}
				return uv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
