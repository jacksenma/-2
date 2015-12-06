package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.SettlementManageService;
import data.reformdata.PaymentListIO;
import data.reformdata.SettlementListIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import vo.financialmanvo.IncomeInputvo;
import vo.financialmanvo.SettlementManagevo;

public class SettlementManageImpl extends UnicastRemoteObject implements SettlementManageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4703457050460075801L;

	public SettlementManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public SettlementManagevo shuRu(String da, String danw, String pers, String shou, int mon, String add) {
		// TODO Auto-generated method stub
		return null;
	}

	public void baocun() {
		// TODO Auto-generated method stub
		
	}

	public boolean getOrder2(IncomeInputvo iivo)  {
		// TODO Auto-generated method stub
//		System.out.println(iivo.beizhu.moneymouth+"sfeferegrttry");
		System.out.println("ssss");

		 FinancialmanService cs = new SettlementListIO();
            try {

            	if(cs.writeOrder2(new IncomeInputpo(iivo)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
