package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.host.HostLog;
import blservice.financialmanblservice.CostManageService;
import data.institutiondata.Institution;
import data.reformdata.PaymentListIO;
import data.reformdata.RecieveListIO;
import data.safetydata.RecordIO;
import data.warehousedata.Storing;
import dataservice.financialmandataservice.FinancialmanService;
import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.Recordpo;
import po.generalmanagepo.Institutionpo;
import vo.financialmanvo.CheckPaymentListvo;
import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.Recordvo;

public class CostManageImpl extends UnicastRemoteObject implements CostManageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 173093101905816120L;

	public CostManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean getOrder(PaymentInputvo o) {
		// TODO Auto-generated method stub
		

            FinancialmanService cs = new PaymentListIO();
            try {
				
            	if(cs.writeOrder(new CostOrderpo(o)))
            		HostLog.addMes("写入付款单"+"\n");
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	public CostManagevo show(String date, int numOfBusHall) {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo jisuan() {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo xinjian(int date, int money, String person, String address, String tiaomu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void daochu(String year,String month,String day,String idd,String shouru,String zhichu,String lirun,int i) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fms = new RecieveListIO();
		try {
			fms.Daochu( year, month, day, idd,shouru,zhichu,lirun,i);
			if(i==1)
				HostLog.addMes("导出收款单"+"\n");
			else if(i==2)
				HostLog.addMes("导出成本收益表"+"\n");
				
			//System.out.println("sssss");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public CostManagevo profit() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasNegative(Moneyvo g) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public RecieveListvo[] SearchByMes(String text, String text2, String text3, String text4)  {
		// TODO Auto-generated method stub
		FinancialmanService fs=new RecieveListIO();
		CashReceiveOrderpo[] rp;
		try {
			rp = fs.SearchByMes(text, text2, text3, text4);
			if(rp==null)  return null;
			else{
				RecieveListvo[] rv = new RecieveListvo[rp.length];
				for(int i=0;i<rp.length;i++){
					RecieveListvo s = rp[i].getRecieveList();
					rv[i]= s;
				}
				HostLog.addMes("查找收款单信息"+"\n");
				return rv;
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	

	@Override
	public void delete(String number) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new PaymentListIO();
		 try {
				
       	if(fs.deletePaymentList(number)){
       		
       		
       	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public CheckPaymentListvo SearchP(String number) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs = new PaymentListIO();
		 
		   
		CostOrderpo co;
			try {
				co = fs.searchp(number);
				if(co == null) return null;
//				HostLog.addMes("查找付款单"+"\n");
		        return new CheckPaymentListvo(co);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		
	}

	@Override
	public boolean record(Recordvo rvo) throws RemoteException {
		// TODO Auto-generated method stub
		 FinancialmanService cs = new RecordIO();
         try {
				
         	if(cs.writeRecord(new Recordpo(rvo)))
         		HostLog.addMes("写入操作记录"+"\n");
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         return false;

}

	@Override
	public Recordvo[] AllRecordSearch() throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService as=new RecordIO();
		Recordpo[] up;
		try {
			up = as.AllSearchRec();
			if(up==null)  return null;
			else{
				HostLog.addMes("查询历史操作记录"+"\n");
				Recordvo[] uv = new Recordvo[up.length];
				for(int i=0;i<up.length;i++){
					Recordvo s = up[i].geUser();
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
	public int getSum(String[] ss,int count) throws RemoteException {
		// TODO Auto-generated method stub
    	int sum=0;
//    	int q=count;
    	
    	for(int i=0;i<count;i++){
    		sum+=Integer.parseInt(ss[i]);
    	}
    	return sum;
	}

	@Override
	public int[] getIncome(String[] ss, String[] sp,int count,int chu) throws RemoteException {
		// TODO Auto-generated method stub
		//计算收款
    	 int shou=0;
    	 for(int i=0;i<count;i++)
    		 shou+=Integer.parseInt(ss[i]);
    	 
    	 
    	 
    	 //计算支出
    	 int zhichu=0;
    	 
    	 for(int i=0;i<chu;i++)
    		zhichu+=Integer.parseInt(sp[i]);
    	 
    	 System.out.println(zhichu);
    	 
    	 //计算收益
    	 int shouyi=shou-zhichu;
    	 System.out.println(shouyi);
    	 int result[]=new int[3];
    	 result[0]=shou;
    	 result[1]=zhichu;
    	 result[2]=shouyi;
    	 HostLog.addMes("计算成本收益"+"\n");
		return result;
	}

	@Override
	public boolean checkYyt(String yytID) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			int count =0;
			Institution fs=new Institution();
			Institutionpo[] ap;
			ap = fs.searchAll();
			if(ap==null)  return false;
			else{
				for(int i=0;i<ap.length;i++){
					if(yytID.equals(ap[i].getID())){
						count++;
					}
				}
				
			}
			if(count!=0)
				return true;
			else
				return false;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}
}