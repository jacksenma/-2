package dataservice.financialmandataservice;



import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.Recordpo;

public interface FinancialmanService {
	 public CostOrderpo search(String ID) throws Exception ;
	 public boolean writeOrder(CostOrderpo cpo) throws Exception;
//	 public PriceAndTimepo query();
//	 public boolean writeProfitList(ReceiveOrderpo r);等写到收益表的时候写
	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception;
//	public boolean writeOrder2(IncomeInputpo incomeInputpo);
//	public boolean writeOrder2(IncomeInputpo incomeInputpo);
	public boolean addAccount(Accountpo accountpo)throws Exception;
	public CashReceiveOrderpo[] SearchByMes(String y,String m,String d,String id)throws Exception;
	public CashReceiveOrderpo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6)throws Exception;
	public CostOrderpo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
			throws Exception;
	public boolean addInitMes(InitMespo initMespo) throws Exception;
	public Accountpo find(String name) throws Exception;
	public Accountpo[] AllSearch() throws Exception;
	public CashReceiveOrderpo[] SearchRe(String text) throws Exception;
	public CostOrderpo[] SearchPay(String text) throws Exception;
	public Accountpo[] MoSearch(String text) throws Exception;
	public boolean deleteAcc(String name) throws Exception;
	public boolean deletePaymentList(String number) throws Exception;
	public CostOrderpo searchp(String number) throws Exception;
	public boolean writeRecord(Recordpo recordpo)  throws Exception;
	public Recordpo[] AllSearchRec()  throws Exception;
	public void writeInit()throws Exception;
	

}
