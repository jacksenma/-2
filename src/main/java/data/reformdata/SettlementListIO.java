package data.reformdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import blservice.financialmanblservice.SettlementManageService;
import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.Recordpo;
import vo.financialmanvo.IncomeInputvo;
import vo.financialmanvo.SettlementManagevo;

public class SettlementListIO implements  FinancialmanService {
	public boolean writeOrder2(IncomeInputpo ipo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/SettlementList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<IncomeInputpo> list = (List<IncomeInputpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			if(list.get(i).getID().equals(cpo.getID()))
//				return false;
//		}
		list.add(ipo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/SettlementList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/settlementList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/settlementList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
//			.getPackingType().toString());
//		}
	}


	public CostOrderpo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean writeOrder(CostOrderpo cpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	public SettlementManagevo shuRu(String da, String danw, String pers, String shou, int mon, String add)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	public void baocun() throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	public boolean addAccount(Accountpo accountpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public CashReceiveOrderpo[] SearchByMes(String y, String m, String d, String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CashReceiveOrderpo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CostOrderpo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean addInitMes(InitMespo initMespo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Accountpo find(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Accountpo[] AllSearch() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CashReceiveOrderpo[] SearchRe(String text) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CostOrderpo[] SearchPay(String text) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Accountpo[] MoSearch(String text) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean deleteAcc(String name) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean deletePaymentList(String number) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public CostOrderpo searchp(String number) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean writeRecord(Recordpo recordpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Recordpo[] AllSearchRec() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void writeInit() throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean addInitAccount(Accountpo accountpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Accountpo[] AllSearchInitAccount() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void Daochu(String year,String month,String day,String idd,String a,String b,String c,int i) throws Exception {
//		return false;
		// TODO Auto-generated method stub
		
	}


//	public boolean getOrder2(IncomeInputvo iivo) throws RemoteException {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
