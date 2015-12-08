package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.StatisticsListService;
import data.reformdata.PaymentListIO;
import data.reformdata.RecieveListIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.CostOrderpo;
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

}
