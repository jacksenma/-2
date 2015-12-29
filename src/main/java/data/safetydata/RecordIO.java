package data.safetydata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.RecieveListpo;
import po.financialmanpo.Recordpo;

public class RecordIO implements FinancialmanService {

	@Override
	public CostOrderpo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean writeOrder(CostOrderpo cpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
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
	public boolean writeRecord(Recordpo rpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/record.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Recordpo> list = (List<Recordpo>) ois.readObject();
		ois.close();
		
		list.add(rpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/record.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;

	

}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/record.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
//		write1();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/record.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
//			.getPackingType().toString());
//		}
	}

	@Override
	public Recordpo[] AllSearchRec() throws Exception {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/record.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Recordpo> result = (List<Recordpo>) ois.readObject();
			ois.close();
			
//			int k=0;
//			for(int i=0;i<result.size();i++){
//				if(result.get(i).role.equals(role)){
//	                    k++;
//				}
//			}
			Recordpo[] up = new Recordpo[result.size()];
//				int p =0;
			for(int i=0;i<result.size();i++){
				
					up[i]=result.get(i);
					
				
			}
			System.out.println("ss");
			return up;
			}catch(Exception e){
				e.printStackTrace();
			} 
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
	public void DaochuRe(RecieveListpo[] rp, String a, String b) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Daochu(String year, String month, String day, String idd, String shouru, String zhichu, String lirun,
			int i) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DaochuPay(CostOrderpo[] rp, String pre, String pro) throws Exception {
		// TODO Auto-generated method stub
		
	}}
