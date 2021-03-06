package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.host.HostLog;
import blservice.financialmanblservice.StatisticsListService;
import data.reformdata.PaymentListIO;
import data.reformdata.RecieveListIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.Paypo;
import po.financialmanpo.RecieveListpo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.StatisticsListvo;

public class StatisticsListImpl extends UnicastRemoteObject implements StatisticsListService {

	public StatisticsListImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatisticsListvo date(String date1, String Date2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean daochu() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public RecieveListvo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new RecieveListIO();
		CashReceiveOrderpo[] rp;
		try {
			rp = fs.SearchReceive(text, text2, text3, text4,text5, text6);
			if(rp==null)  return null;
			else{
				HostLog.addMes("显示期间收款单信息"+"\n");
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
	public PaymentInputvo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
			throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fs=new PaymentListIO();
		CostOrderpo[] rp;
		try {
			rp = fs.SearchPay(text, text2, text3, text4,text5, text6);
			if(rp==null)  return null;
			else{
				HostLog.addMes("显示期间付款单"+"\n");
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
	public void daochuRe(RecieveListvo[] searchReceive,String pre,String pro) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fms = new RecieveListIO();
		RecieveListpo[] rp=new RecieveListpo[searchReceive.length];
		try {
			for(int i=0;i<searchReceive.length;i++){
				rp[i]=new RecieveListpo(searchReceive[i]);
			}
			HostLog.addMes("导出统计报表"+"\n");
			fms.DaochuRe(rp,pre,pro);
				
			//System.out.println("sssss");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void daochuPay(PaymentInputvo[] searchPay, String pre, String pro) throws RemoteException {
		// TODO Auto-generated method stub
		FinancialmanService fms = new PaymentListIO();
		CostOrderpo[] rp=new CostOrderpo[searchPay.length];
		try {
			for(int i=0;i<searchPay.length;i++){
				rp[i]=new CostOrderpo(searchPay[i]);
			}
			
			fms.DaochuPay(rp,pre,pro);
				
			//System.out.println("sssss");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
