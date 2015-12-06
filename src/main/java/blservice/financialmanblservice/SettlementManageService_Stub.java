package blservice.financialmanblservice;

import java.rmi.RemoteException;

import po.financialmanpo.IncomeInputpo;
import vo.financialmanvo.IncomeInputvo;
import vo.financialmanvo.SettlementManagevo;

public class SettlementManageService_Stub implements SettlementManageService{

	public SettlementManagevo shuRu(String da, String danw, String pers, String shou, int mon, String add) {
		System.out.println("正在输入表格");// TODO Auto-generated method stub
		return null;
	}

	public void baocun() {
		System.out.println("已经保存");
		// TODO Auto-generated method stub
		
	}

	public boolean getOrder2(IncomeInputvo iivo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws RemoteException, Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}
