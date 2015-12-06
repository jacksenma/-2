package data.reformdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.RecieveListpo;

import vo.financialmanvo.SettlementManagevo;

public class RecieveListIO implements  FinancialmanService {
	public CashReceiveOrderpo[] SearchByMes(String year,String month,String day,String idd) throws Exception {
		// TODO Auto-generated method stub
		try{
			System.out.println("laile ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CashReceiveOrderpo> result = (List<CashReceiveOrderpo>) ois.readObject();
		ois.close();
//		System.out.println("??");
		int k=0;
//		System.out.println("q");
		for(int i=0;i<result.size();i++){
//			System.out.println("66");
			if(result.get(i).year.equals(year)&&result.get(i).month.equals(month)&&result.get(i).day.equals(day)&&
					result.get(i).ID.equals(idd)){
				System.out.println("---");
                    k++;
			}
		}
		CashReceiveOrderpo[] sp = new CashReceiveOrderpo[k];
//		System.out.println("???");
			int p =0;
		for(int i=0;i<result.size();i++){
			if((result.get(i).year.equals(year)&&result.get(i).month.equals(month)&&result.get(i).day.equals(day)&&
					result.get(i).ID.equals(idd))){
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
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/cashReceive.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<RecieveListpo> list = (List<RecieveListpo>) ois.readObject();
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
	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public CashReceiveOrderpo[] SearchReceive(String year1, String month1, String day1, String year2, String month2,
			String day2) throws Exception {
		// TODO Auto-generated method stub
		try{
//			System.out.println("laile ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CashReceiveOrderpo> result = (List<CashReceiveOrderpo>) ois.readObject();
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
//		Integer.parseInt(result.get(i).year)
//		Integer.parseInt(result.get(i).month)
//		Integer.parseInt(result.get(i).day)
		
		for(int i=0;i<result.size();i++){
			if(y1==Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)==y2){
				if(m1==Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)==m2){
					if(d1<=Integer.parseInt(result.get(i).day)&&Integer.parseInt(result.get(i).day)<=d2)
						k++;
				}
				else if(m1==Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)<m2){
					if(d1<=Integer.parseInt(result.get(i).day))
						k++;
				}
				else if(m1<Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)==m2){
					if(Integer.parseInt(result.get(i).day)<=d2)
						k++;
				}
				else if(m1<Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)<m2)
					k++;
			
			}
			else if(y1==Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)<y2){
				System.out.println("y1=y<y2");
				if(m1==Integer.parseInt(result.get(i).month)){
					System.out.println("m1=m");
					if(d1<=Integer.parseInt(result.get(i).day)){
						System.out.println("d1<=d");
						k++;
//						System.out.println("lalala");
					}
							
				}
				else if(m1<Integer.parseInt(result.get(i).month))
					k++;
			}
			else if(y1<Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)==y2){
				if(m2==Integer.parseInt(result.get(i).month)){
					if(d2>=Integer.parseInt(result.get(i).day))
						k++;
				}
				else if(m2>Integer.parseInt(result.get(i).month))
					k++;
			}
			
			

			
				
				
				
				
				
				
				
			
//			else if(Integer.parseInt(result.get(i).year)==Integer.parseInt(year1)){
//				if(Integer.parseInt(result.get(i).month)>Integer.parseInt(month1))
//			}
//			if(Integer.parseInt(result.get(i).year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).month)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).day)>=Integer.parseInt(day1)&&
//					Integer.parseInt(result.get(i).year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).month)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).day)<=Integer.parseInt(day2)){
//				System.out.println("---");
//                    k++;
//			}
		}
		CashReceiveOrderpo[] sp = new CashReceiveOrderpo[k];
//		System.out.println("???");
			int p =0;
		for(int i=0;i<result.size();i++){
//			if(Integer.parseInt(result.get(i).year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).month)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).day)>=Integer.parseInt(day1)&&
//					Integer.parseInt(result.get(i).year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).month)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).day)<=Integer.parseInt(day2)){
//				sp[p]=result.get(i);
//				p++;
//			}
			if(y1==Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)==y2){
				if(m1==Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)==m2){
					if(d1<=Integer.parseInt(result.get(i).day)&&Integer.parseInt(result.get(i).day)<=d2){
					sp[p]=result.get(i);
					p++;}
						
				}
				else if(m1==Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)<m2){
					if(d1<=Integer.parseInt(result.get(i).day)){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m1<Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)==m2){
					if(Integer.parseInt(result.get(i).day)<=d2){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m1<Integer.parseInt(result.get(i).month)&&Integer.parseInt(result.get(i).month)<m2){
					sp[p]=result.get(i);
					p++;
				}
					
			
			}
			else if(y1==Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)<y2){
				if(m1==Integer.parseInt(result.get(i).month)){
					if(d1<=Integer.parseInt(result.get(i).day)){
						sp[p]=result.get(i);
						p++;
					}
							
				}
				else if(m1<Integer.parseInt(result.get(i).month)){
					sp[p]=result.get(i);
					p++;
				}
					
			}
			else if(y1<Integer.parseInt(result.get(i).year)&&Integer.parseInt(result.get(i).year)==y2){
				if(m2==Integer.parseInt(result.get(i).month)){
					if(d2>=Integer.parseInt(result.get(i).day)){
						sp[p]=result.get(i);
						p++;
					}
						
				}
				else if(m2>Integer.parseInt(result.get(i).month)){
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
	public CostOrderpo[] SearchPay(String text, String text2, String text3, String text4, String text5, String text6)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


//	public boolean getOrder2(IncomeInputvo iivo) throws RemoteException {
//		// TODO Auto-generated method stub
//		return false;
//	}
}

