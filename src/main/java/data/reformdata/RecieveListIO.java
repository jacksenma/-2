package data.reformdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.InitMespo;
import po.financialmanpo.RecieveListpo;
import po.financialmanpo.Recordpo;
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
		try{
			System.out.println("........... ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CashReceiveOrderpo> result = (List<CashReceiveOrderpo>) ois.readObject();
		ois.close();

		int k=0;

		for(int i=0;i<result.size();i++){

			if(result.get(i).zhanghu.equals(text)){
				System.out.println("---");
                    k++;
			}
		}
		CashReceiveOrderpo[] sp = new CashReceiveOrderpo[k];

			int p =0;
		for(int i=0;i<result.size();i++){
			if(result.get(i).zhanghu.equals(text)){
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
	public void Daochu(String year,String month,String day,String idd,String shouru,
			String zhichu,String lirun,int j) throws Exception {
		// TODO Auto-generated method stub
	if(j==1){
		HSSFWorkbook wb = new HSSFWorkbook();  
		HSSFSheet sheet = wb.createSheet("收款单信息表");  
		HSSFRow row = sheet.createRow((int) 0);  
		HSSFCellStyle style = wb.createCellStyle();  
	    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	    HSSFCell cell = row.createCell((short) 0);  
	     cell.setCellValue("收款日期");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 1);  
	     cell.setCellValue("营业厅编号");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 2);  
	     cell.setCellValue("收款金额(/元)");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 3);  
	     cell.setCellValue("订单条形码号");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 4);  
	     cell.setCellValue("收款快递员");  
	     cell.setCellStyle(style);
	     cell = row.createCell((short) 5);  
	     cell.setCellValue("收款账户");  
	     cell.setCellStyle(style);
//	     cell = row.createCell((short) 6);  
//	     cell.setCellValue("位号");  
//	     cell.setCellStyle(style);
//	     cell = row.createCell((short) 7);  
//	     cell.setCellValue("中转中心");  
//	     cell.setCellStyle(style);
//	     FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			@SuppressWarnings("unchecked")
//			List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
//			ois.close();
	     try{
				System.out.println("laile ");
				FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
//				System.out.println("?");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<CashReceiveOrderpo> list = (List<CashReceiveOrderpo>) ois.readObject();
			ois.close();
//			System.out.println("??");
			int k=0;
//			System.out.println("q");
			for(int i=0;i<list.size();i++){
//				System.out.println("66");
				if(list.get(i).year.equals(year)&&list.get(i).month.equals(month)&&list.get(i).day.equals(day)&&
						list.get(i).ID.equals(idd)){
					System.out.println("---");
	                    k++;
				}
			}
			CashReceiveOrderpo[] sp = new CashReceiveOrderpo[k];
//			System.out.println("???");
				int p =0;
			for(int i=0;i<list.size();i++){
				if((list.get(i).year.equals(year)&&list.get(i).month.equals(month)&&list.get(i).day.equals(day)&&
						list.get(i).ID.equals(idd))){
					sp[p]=list.get(i);
					p++;
				}
			}
//			System.out.println("????");
			for (int i = 0; i <sp.length;i++)  
	        {  
	            row = sheet.createRow((int) i + 1);  
	            sp[i]=list.get(i);  
	            // 第四步，创建单元格，并设置值  
	            row.createCell((short) 0).setCellValue(sp[i].year+"-"+sp[i].month+"-"+sp[i].day);  
	            row.createCell((short) 1).setCellValue(sp[i].ID);  
	            row.createCell((short) 2).setCellValue(sp[i].money);  
	            row.createCell((short) 3).setCellValue(sp[i].tiaoxingma);  
	            row.createCell((short) 4).setCellValue(sp[i].kuaidiyuan);
	            row.createCell((short) 5).setCellValue(sp[i].zhanghu);
//	            row.createCell((short) 6).setCellValue(sp[i].weihao);
//	            row.createCell((short) 7).setCellValue(sp[i].zhongzhuan);
	            
	            
	        }
	            try  
	                    {  
	                        FileOutputStream fout = new FileOutputStream("C:/大作业代码/"+"收款单信息"+"("+year+"-"+month
	                    +"-"+day+"by"+idd+")"+".xls"); 
	                       wb.write(fout);  
	                        fout.close();  
	                    }  
	                    catch (Exception e)  
	                    {  
	                        e.printStackTrace();  

	                    }  

	
	            System.out.println("导出成功！");
			
			}catch(Exception e){

				e.printStackTrace();
			} 
	}
	
	else if(j==2){
		HSSFWorkbook wb = new HSSFWorkbook();  
		HSSFSheet sheet = wb.createSheet("成本收益表");  
		HSSFRow row = sheet.createRow((int) 0);  
		HSSFCellStyle style = wb.createCellStyle();  
	    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	    HSSFCell cell = row.createCell((short) 0);  
	     cell.setCellValue("截止日期");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 1);  
	     cell.setCellValue("总收入(/元)");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 2);  
	     cell.setCellValue("总支出(/元)");  
	     cell.setCellStyle(style);  
	     cell = row.createCell((short) 3);  
	     cell.setCellValue("总利润(/元)");  
	     cell.setCellStyle(style);  
//	     cell = row.createCell((short) 4);  
//	     cell.setCellValue("收款快递员");  
//	     cell.setCellStyle(style);
//	     cell = row.createCell((short) 5);  
//	     cell.setCellValue("收款账户");  
//	     cell.setCellStyle(style);
//	     cell = row.createCell((short) 6);  
//	     cell.setCellValue("位号");  
//	     cell.setCellStyle(style);
//	     cell = row.createCell((short) 7);  
//	     cell.setCellValue("中转中心");  
//	     cell.setCellStyle(style);
//	     FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			@SuppressWarnings("unchecked")
//			List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
//			ois.close();
	     
				

			
	            row = sheet.createRow(1);  
	          
	            // 第四步，创建单元格，并设置值  
	            row.createCell((short) 0).setCellValue(year+"-"+month+"-"+day);  
	            row.createCell((short) 1).setCellValue(shouru);  
	            row.createCell((short) 2).setCellValue(zhichu);  
	            row.createCell((short) 3).setCellValue(lirun);  
	            
//	            row.createCell((short) 6).setCellValue(sp[i].weihao);
//	            row.createCell((short) 7).setCellValue(sp[i].zhongzhuan);
	            
	            
	        
	             
	                        FileOutputStream fout = new FileOutputStream("C:/大作业代码/"+"成本收益表信息"+"("+year+"-"+month
	                    +"-"+day+")"+".xls"); 
	                       wb.write(fout);  
	                        fout.close();  
	                

	
	            System.out.println("导出成功！");
			
			
	}

			
		
	}


//	public boolean getOrder2(IncomeInputvo iivo) throws RemoteException {
//		// TODO Auto-generated method stub
//		return false;
//	}
}

