package data.reformdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.financialmandataservice.FinancialmanService;
import dataservice.generalmanagerdataservice.OrderService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.ExamineType;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.Recordpo;

public class PaymentListIO implements FinancialmanService, OrderService {

	public CostOrderpo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
		System.out.println("find");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}

	public boolean writeOrder(CostOrderpo cpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			if(list.get(i).getID().equals(cpo.getID()))
//				return false;
//		}
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/paymentList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/paymentList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
//			.getPackingType().toString());
//		}
	}

	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAccount(Accountpo accountpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] SearchUnchecked() {
		// TODO Auto-generated method stub
		int count=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(ExamineType.NOApproval))
				count++;
		}
		String result [] = new String[count];
		int k=0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(ExamineType.NOApproval)){
				result[k]=list.get(i).getID();
			       k++;
			}
		}
		System.out.println("find unchecked");
		return result;
	}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void approve(String s) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
			ois.close();
			for(int i = 0; i < list.size(); i++){
				if(list.get(i).getID().equals(s));
			       list.get(i).ext=ExamineType.Approve;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/paymentList.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		}catch(Exception e){
				e.printStackTrace();
			}	
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
	public CostOrderpo[] SearchPay(String year1, String month1, String day1, String year2, String month2,
			String day2)
			throws Exception {
		// TODO Auto-generated method stub
		try{
			System.out.println("laile ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> result = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		System.out.println("??");
		int k=0;
//		System.out.println("q");
		int y1=Integer.parseInt(year1);
		int m1=Integer.parseInt(month1);
		int d1=Integer.parseInt(day1);
		int y2=Integer.parseInt(year2);
		int m2=Integer.parseInt(month2);
		int d2=Integer.parseInt(day2);
		for(int i=0;i<result.size();i++){
//			System.out.println("66");
//			if(Integer.parseInt(result.get(i).dvo.year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).dvo.mouth)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).dvo.day)>=Integer.parseInt(day1)&&
//					Integer.parseInt(result.get(i).dvo.year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).dvo.mouth)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).dvo.day)<=Integer.parseInt(day2)){
//				System.out.println("---");
//                    k++;
//			}
			//
			if(y1<Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)<y2){
				k++;
			}
			
			
			
			//
			else if(y1==Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)==y2){
				if(m1==Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)==m2){
					if(d1<=Integer.parseInt(result.get(i).dvo.day)&&Integer.parseInt(result.get(i).dvo.day)<=d2)
						k++;
				}
				else if(m1==Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)<m2){
					if(d1<=Integer.parseInt(result.get(i).dvo.day))
						k++;
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)==m2){
					if(Integer.parseInt(result.get(i).dvo.day)<=d2)
						k++;
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)<m2)
					k++;
			
			}
			else if(y1==Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)<y2){
				System.out.println("y1=y<y2");
				if(m1==Integer.parseInt(result.get(i).dvo.mouth)){
					System.out.println("m1=m");
					if(d1<=Integer.parseInt(result.get(i).dvo.day)){
						System.out.println("d1<=d");
						k++;
//						System.out.println("lalala");
					}
							
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth))
					k++;
			}
			else if(y1<Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)==y2){
				if(m2==Integer.parseInt(result.get(i).dvo.mouth)){
					if(d2>=Integer.parseInt(result.get(i).dvo.day))
						k++;
				}
				else if(m2>Integer.parseInt(result.get(i).dvo.mouth))
					k++;
			}
			
			
		}
		CostOrderpo[] sp = new CostOrderpo[k];
//		System.out.println("???");
			int p =0;
		for(int i=0;i<result.size();i++){
//			if(Integer.parseInt(result.get(i).dvo.year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).dvo.mouth)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).dvo.day)>=Integer.parseInt(day1)&&
//					Integer.parseInt(result.get(i).dvo.year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).dvo.mouth)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).dvo.day)<=Integer.parseInt(day2)){
//				sp[p]=result.get(i);
//				p++;
//			}
			//
			if(y1<Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)<y2){
				sp[p]=result.get(i);
				p++;
			}
			
			//
			else if(y1==Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)==y2){
				if(m1==Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)==m2){
					if(d1<=Integer.parseInt(result.get(i).dvo.day)&&Integer.parseInt(result.get(i).dvo.day)<=d2){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m1==Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)<m2){
					if(d1<=Integer.parseInt(result.get(i).dvo.day)){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)==m2){
					if(Integer.parseInt(result.get(i).dvo.day)<=d2){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth)&&Integer.parseInt(result.get(i).dvo.mouth)<m2){
					sp[p]=result.get(i);
					p++;
				}
					
			
			}
			else if(y1==Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)<y2){
				System.out.println("y1=y<y2。。。。。。。。。。。。。");
				if(m1==Integer.parseInt(result.get(i).dvo.mouth)){
					System.out.println("m1=m。。。。。。。。。。。。");
					if(d1<=Integer.parseInt(result.get(i).dvo.day)){
						System.out.println("d1<=d。。。。。。。。。。。。");
						sp[p]=result.get(i);
						p++;
//						System.out.println("lalala");
					}
							
				}
				else if(m1<Integer.parseInt(result.get(i).dvo.mouth)){
					sp[p]=result.get(i);
					p++;
				}
					
			}
			else if(y1<Integer.parseInt(result.get(i).dvo.year)&&Integer.parseInt(result.get(i).dvo.year)==y2){
				if(m2==Integer.parseInt(result.get(i).dvo.mouth)){
					if(d2>=Integer.parseInt(result.get(i).dvo.day)){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m2>Integer.parseInt(result.get(i).dvo.mouth)){
					sp[p]=result.get(i);
					p++;
				}
					
			}
		}
//		System.out.println("????");
		return sp;
		}catch(Exception e){
			e.printStackTrace();
		} 
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
		try{
			System.out.println("........... ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/paymentList.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> result = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		System.out.println("??");
		int k=0;
//		System.out.println("q");
		for(int i=0;i<result.size();i++){
//			System.out.println("66");
			if(result.get(i).pay.account.equals(text)){
				System.out.println("---");
                    k++;
			}
		}
		CostOrderpo[] sp = new CostOrderpo[k];
//		System.out.println("???");
			int p =0;
		for(int i=0;i<result.size();i++){
			if(result.get(i).pay.account.equals(text)){
				sp[p]=result.get(i);
				p++;
			}
		}
//		System.out.println("????");
		return sp;
		}catch(Exception e){
			e.printStackTrace();
		} 
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
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/PaymentList.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<CostOrderpo> result = (List<CostOrderpo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				if(((result.get(i)).beizhu.number).equals(number)){
					result.remove(i);
					i--;
					System.out.println("Delete ING");
				}}
			ois.close();
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/PaymentList.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		return true;
	}

	@Override
	public CostOrderpo searchp(String number) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println("aaaa");
			if(list.get(i).beizhu.number.equals(number))
				return list.get(i);
		}
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
	}



