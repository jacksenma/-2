package data.accountdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.financialmandataservice.FinancialmanService;
import po.administratorpo.UserMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.Recordpo;

public class AccountIO implements FinancialmanService{
	public boolean addAccount(Accountpo apo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/accountMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Accountpo> list = (List<Accountpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getAccountName().equals(apo.getAccountName()))
				return false;
		}
		list.add(apo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/accountMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;

}
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/accountMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void write1() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/InitMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		write1();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/accountMes.txt");
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

	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception {
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
		FileInputStream fis = new FileInputStream("src/main/java/data/save/InitMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InitMespo> list = (List<InitMespo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			if(list.get(i).getID().equals(cpo.getID()))
//				return false;
//		}
		list.add(initMespo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/InitMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;

	}
	@Override
	public Accountpo find(String name) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/accountMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Accountpo> list = (List<Accountpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println("aaaa");
			if(list.get(i).getAccountName().equals(name))
				return list.get(i);
		}
		return null;
		
		
	}
	@Override
	public Accountpo[] AllSearch() throws Exception {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/accountMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Accountpo> result = (List<Accountpo>) ois.readObject();
			ois.close();
			
//			int k=0;
//			for(int i=0;i<result.size();i++){
//				if(result.get(i).role.equals(role)){
//	                    k++;
//				}
//			}
			Accountpo[] up = new Accountpo[result.size()];
//				int p =0;
			for(int i=0;i<result.size();i++){
				
					up[i]=result.get(i);
					
				
			}
			return up;
			}catch(Exception e){
				e.printStackTrace();
			} 
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
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/accountMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Accountpo> result = (List<Accountpo>) ois.readObject();
			ois.close();
			
			int k=0;
			for(int i=0;i<result.size();i++){
				if(result.get(i).getAccountName().contains(text)){
	                    k++;
				}
			}
			Accountpo[] ap = new Accountpo[k];
				int p =0;
			for(int j=0;j<result.size();j++){
					if(result.get(j).getAccountName().contains(text)){
					ap[p]=result.get(j);
					p++;}
					}
			return ap;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}
	@Override
	public boolean deleteAcc(String name) throws Exception {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/accountMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Accountpo> result = (List<Accountpo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				if(((result.get(i)).getAccountName()).equals(name)){
					result.remove(i);
					i--;
					System.out.println("Delete Institution");
				}}
			ois.close();
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/accountMes.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		return true;
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
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/accountMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		
		FileOutputStream fos1 = 
				new FileOutputStream("src/main/java/data/save/PaymentList.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		List<String> l1 = new ArrayList<String>();
		oos1.writeObject(l1);
		oos1.close();
		
		FileOutputStream fos2 = 
				new FileOutputStream("src/main/java/data/save/carLoading.txt");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		List<String> l2 = new ArrayList<String>();
		oos2.writeObject(l2);
		oos2.close();
		
		FileOutputStream fos3 = 
				new FileOutputStream("src/main/java/data/save/carMes.txt");
		ObjectOutputStream oos3 = new ObjectOutputStream(fos3);
		List<String> l3= new ArrayList<String>();
		oos3.writeObject(l3);
		oos3.close();
		
		FileOutputStream fos4 = 
				new FileOutputStream("src/main/java/data/save/cashReceive.txt");
		ObjectOutputStream oos4 = new ObjectOutputStream(fos4);
		List<String> l4 = new ArrayList<String>();
		oos4.writeObject(l4);
		oos4.close();
		
		
		FileOutputStream fos5 = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos5 = new ObjectOutputStream(fos5);
		List<String> l5 = new ArrayList<String>();
		oos5.writeObject(l5);
		oos5.close();
		
		FileOutputStream fos6 = 
				new FileOutputStream("src/main/java/data/save/driverMes.txt");
		ObjectOutputStream oos6 = new ObjectOutputStream(fos6);
		List<String> l6 = new ArrayList<String>();
		oos6.writeObject(l6);
		oos6.close();
		
		FileOutputStream fos7 = 
				new FileOutputStream("src/main/java/data/save/Institution.txt");
		ObjectOutputStream oos7 = new ObjectOutputStream(fos7);
		List<String> l7 = new ArrayList<String>();
		oos7.writeObject(l7);
		oos7.close();
		
		FileOutputStream fos8= 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos8 = new ObjectOutputStream(fos8);
		List<String> l8 = new ArrayList<String>();
		oos8.writeObject(l8);
		oos8.close();
		
		FileOutputStream fos9= 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos9 = new ObjectOutputStream(fos9);
		List<String> l9 = new ArrayList<String>();
		oos9.writeObject(l9);
		oos9.close();//还有几个txt没有清空
		FileOutputStream fos10 = 
				new FileOutputStream("src/main/java/data/save/city.txt");
		ObjectOutputStream oos10 = new ObjectOutputStream(fos10);
		List<String> l10 = new ArrayList<String>();
		oos10.writeObject(l10);
		oos10.close();
		
		FileOutputStream fos11 = 
				new FileOutputStream("src/main/java/data/save/constancy.txt");
		ObjectOutputStream oos11 = new ObjectOutputStream(fos11);
		List<String> l11 = new ArrayList<String>();
		oos11.writeObject(l11);
		oos11.close();
		
		FileOutputStream fos12 = 
				new FileOutputStream("src/main/java/data/save/receiveOrder.txt");
		ObjectOutputStream oos12 = new ObjectOutputStream(fos12);
		List<String> l12 = new ArrayList<String>();
		oos12.writeObject(l12);
		oos12.close();
		
		FileOutputStream fos13 = 
				new FileOutputStream("src/main/java/data/save/record.txt");
		ObjectOutputStream oos13 = new ObjectOutputStream(fos13);
		List<String> l13= new ArrayList<String>();
		oos13.writeObject(l13);
		oos13.close();
		
		FileOutputStream fos14 = 
				new FileOutputStream("src/main/java/data/save/salary.txt");
		ObjectOutputStream oos14 = new ObjectOutputStream(fos14);
		List<String> l14 = new ArrayList<String>();
		oos14.writeObject(l14);
		oos14.close();
		
		
		FileOutputStream fos15 = 
				new FileOutputStream("src/main/java/data/save/sendOrder.txt");
		ObjectOutputStream oos15 = new ObjectOutputStream(fos15);
		List<String> l15 = new ArrayList<String>();
		oos15.writeObject(l15);
		oos15.close();
		
		FileOutputStream fos16 = 
				new FileOutputStream("src/main/java/data/save/SettlementList.txt");
		ObjectOutputStream oos16 = new ObjectOutputStream(fos16);
		List<String> l16 = new ArrayList<String>();
		oos16.writeObject(l16);
		oos16.close();
		
		FileOutputStream fos17 = 
				new FileOutputStream("src/main/java/data/save/staff.txt");
		ObjectOutputStream oos17 = new ObjectOutputStream(fos17);
		List<String> l17 = new ArrayList<String>();
		oos17.writeObject(l17);
		oos17.close();
		
		FileOutputStream fos18= 
				new FileOutputStream("src/main/java/data/save/TafficOrder.txt");
		ObjectOutputStream oos18 = new ObjectOutputStream(fos18);
		List<String> l18 = new ArrayList<String>();
		oos18.writeObject(l18);
		oos18.close();
		
		FileOutputStream fos19= 
				new FileOutputStream("src/main/java/data/save/transitReceiveOrder.txt");
		ObjectOutputStream oos19 = new ObjectOutputStream(fos19);
		List<String> l19 = new ArrayList<String>();
		oos19.writeObject(l19);
		oos19.close();//还有几个txt没有清空
		
		FileOutputStream fos20= 
				new FileOutputStream("src/main/java/data/save/UserMes.txt");
		ObjectOutputStream oos20 = new ObjectOutputStream(fos20);
		List<String> l20 = new ArrayList<String>();
		oos20.writeObject(l20);
		oos20.close();
		
		FileOutputStream fos21= 
				new FileOutputStream("src/main/java/data/save/warning.txt");
		ObjectOutputStream oos21 = new ObjectOutputStream(fos21);
		List<String> l21 = new ArrayList<String>();
		oos21.writeObject(l21);
		oos21.close();//还有几个txt没有清空
		
		
		
	}
}
