package blservice.financialmanblservice;

import java.rmi.RemoteException;

import data.accountdata.AccountIO;
import data.reformdata.PaymentListIO;
import data.safetydata.RecordIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.financialmanpo.Accountpo;
import po.financialmanpo.Recordpo;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.CheckPaymentListvo;
import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.Recordvo;

public class CostManageService_Stub implements CostManageService {

	public CostManagevo show(String date, int numOfBusHall) {
		System.out.println("查看收款单");
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo jisuan() {
		System.out.println("计算总成本");
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo xinjian(int date, int money, String person, String address, String tiaomu) {
		// TODO Auto-generated method stub
		System.out.println("新建付款单");
		return null;
	}

	public boolean daochu() {
		System.out.println("是否导出");
		// TODO Auto-generated method stub
		return false;
	}

	public CostManagevo profit() {
		System.out.println("计算总收益");
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getOrder(PaymentInputvo pivo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasNegative(Moneyvo g) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RecieveListvo[] SearchByMes(String text, String text2, String text3, String text4) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public RecieveListvo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
//			String text6) throws RemoteException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public PaymentInputvo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
//			throws RemoteException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void delete(String number) throws RemoteException {
		// TODO Auto-generated method stub
		
       
	}

	@Override
	public CheckPaymentListvo SearchP(String number) throws RemoteException {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean record(Recordvo rvo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Recordvo[] AllRecordSearch() throws RemoteException {
		return null;
		// TODO Auto-generated method stub
		
	}}


