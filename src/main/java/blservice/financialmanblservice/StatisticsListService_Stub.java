package blservice.financialmanblservice;

import java.rmi.RemoteException;

import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.StatisticsListvo;

public abstract class StatisticsListService_Stub implements StatisticsListService {

	public StatisticsListvo date(String date1, String Date2) {
		System.out.println("数入起止日期");
		// TODO Auto-generated method stub
		return null;
	}

	public boolean daochu() {
		System.out.println("是否导出");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RecieveListvo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentInputvo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void daochuRe(RecieveListvo[] searchReceive, String pre, String pro) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	

}
