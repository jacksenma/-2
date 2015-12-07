package data.warehousedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.ClExamineType;
import po.bushallsalmanpo.SendOrderpo;
import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Institutionpo;
import po.otherdatapo.Staffpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.IsExamineType;
import po.stockmanagermanpo.OsExamineType;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.StoreCheckpo;
import po.stockmanagermanpo.Warningpo;

public class Storing implements StockManagermanService {
	
	public static boolean write1() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/warning.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}
	
	public static boolean write2() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}
	
	public static boolean write3() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}

	public boolean set(Warningpo wpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Warningpo> list = (List<Warningpo>) ois.readObject();
		ois.close();
		list.add(wpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/warning.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		write1();
		write2();
		write3();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Warningpo> list = (List<Warningpo>) ois.readObject();
		ois.close();
		
	}

	public boolean in(InStoringpo ipo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		list.add(ipo);
		FileInputStream fis1 = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		@SuppressWarnings("unchecked")
		List<Warningpo> list1 = (List<Warningpo>) ois1.readObject();
		//System.out.println(4*Integer.parseInt(list1.get(0).warning)/100);
		int k=0;
		for(int i=0;i<list1.size();i++){
			if(list1.get(i).zhongzhuan==ipo.getZhongzhuan()){
				k=i;
				break;
			}
		}
		if(list.size()>=1000*Integer.parseInt(list1.get(k).warning)/100){
			JOptionPane.showMessageDialog(null, "库存数量已超过警戒比例", "警告！", 
            		JOptionPane.ERROR_MESSAGE);
		}
		ois1.close();
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean out(OutStoringpo opo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/outstock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<OutStoringpo> list = (List<OutStoringpo>) ois.readObject();
		ois.close();
		list.add(opo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		FileInputStream fis1 = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list1 = (List<InStoringpo>) ois1.readObject();
		for(int i=0;i<list1.size();i++){
			if(((list1.get(i)).getID()).equals(opo.getID())){
				list1.remove(i);
				i--;
				//System.out.println("Delete ");
			}}
		ois1.close();
        FileOutputStream fos1 = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(list1);
		oos1.close();

		return true;
	}

	public boolean initialize() throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
	}

	public InStoringpo[] search() throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		System.out.println("find");
		
		InStoringpo[] sp = new InStoringpo[list.size()];
		for(int i=0;i<list.size();i++){
//				if(list.get(i).getZhongzhuan()==zhongzhuan){
				sp[i]=list.get(i);
//				}
		}
		return sp;
		
	
	}

	public String[] SearchUncheckedoutstock() {
		// TODO Auto-generated method stub
		int count=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/outstock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<OutStoringpo> list = (List<OutStoringpo>) ois.readObject();
		ois.close();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(OsExamineType.NOApproval))
				count++;
		}
		int k=0;
		String result [] = new String[count];
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(OsExamineType.NOApproval)){
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

	public String[] SearchUncheckedinstock() {
		// TODO Auto-generated method stub
		int count=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getID());
            if(list.get(i).getExamineType().equals(IsExamineType.NOApproval))
				count++;
		}
		 int k=0;
		String result [] = new String[count];
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(IsExamineType.NOApproval)){
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

	public void approveinstock(String iD) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
			ois.close();
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i).getID());
	            if(list.get(i).getID().equals(iD))
	            		list.get(i).ise=IsExamineType.Approve;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/instock.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		}catch(Exception e){
				e.printStackTrace();
			}
	}

	public void approveoutstock(String iD) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("src/main/java/data/save/outstock.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<OutStoringpo> list = (List<OutStoringpo>) ois.readObject();
			ois.close();
			for(int i = 0; i < list.size(); i++){
				if(list.get(i).getID().equals(iD))
                 list.get(i).ose=OsExamineType.Approve;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/outstock.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		}catch(Exception e){
				e.printStackTrace();
			}
	}

	@Override
	public InStoringpo getInstock() {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InStoringpo> result = (List<InStoringpo>) ois.readObject();
		ois.close();
		 InStoringpo cp =result.get(result.size()-1);
         return cp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public OutStoringpo getOutstock() {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/main/java/data/save/outstock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<OutStoringpo> result = (List<OutStoringpo>) ois.readObject();
		ois.close();
		 OutStoringpo cp =result.get(result.size()-1);
         return cp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
