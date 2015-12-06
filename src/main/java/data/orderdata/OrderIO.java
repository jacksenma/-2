package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.courierdataservice.CourierService;
import dataservice.generalmanagerdataservice.OrderService;
import dataservice.otherdataservice.ExpressService;
import dataservice.transitmandataservice.TransitManService;
import po.courierpo.CourierOrderpo;
import po.courierpo.ExamineType;
import po.courierpo.PriceAndTimepo;
import po.courierpo.ReceiveOrderpo;
import po.transitmanpo.TransitReceiveOrderpo;

public class OrderIO implements TransitManService, CourierService, ExpressService, OrderService {
	
	public boolean writeOrder(CourierOrderpo cpo) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getID().equals(cpo.getID()))
				return false;
		}
		cpo.getHistory().add("快递员已揽件");
		System.out.println(cpo.date);
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	public CourierOrderpo search(String ID) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		System.out.println("find"+"22222");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
			.getPackingType().toString());
		}
	}

	public boolean writeReceive(ReceiveOrderpo r) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
			
			
			CourierOrderpo cpo = null;
			for(int i = 0 ; i < list.size() ; i++){
				if(list.get(i).getID().equals(r.ID))
					cpo = list.get(i);
			}
			ois.close();
			System.out.println(r.ID);
			if(cpo == null) return false;
			if(cpo.rece) return false;
                        if(cpo.getExamineType() == ExamineType.NOApproval || 
                                cpo.getExamineType() == ExamineType.NotApprove)
                            return false;
			cpo.rece = true;
			cpo.getHistory().add("已收件，收件人是" + r.receiver + " , 收件时间是"
					+ r.date.year + "年" + r.date.month + "月" + 
					r.date.day + "日");
			
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/courierOrder.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public PriceAndTimepo query(PriceAndTimepo p) {
		// TODO Auto-generated method stub
		p.price = 50;
		return p;
	}
	
	public boolean addHistory(String ID , String history) throws Exception{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		CourierOrderpo cpo = null;
		
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getID().equals(ID)){
				cpo = list.get(i);
				break;
			}
		}
		if(cpo == null) return false;
		
		cpo.getHistory().add(history);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		
		return true;
	}

	@Override
	public String[] SearchUnchecked() {
		// TODO Auto-generated method stub	
		int count=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(ExamineType.NOApproval))
				count++;
		}
		int k=0;
		String result [] = new String[count];
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
	public boolean receiveOrderWrite(TransitReceiveOrderpo po) throws Exception {
		// TODO Auto-generated method stub
		CourierOrderpo cpo = search(po.ID);
		if(cpo.getExamineType() != ExamineType.Approve) return false;
		
		FileInputStream fis = new FileInputStream
				("src/main/java/data/save/transitReceiveOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<TransitReceiveOrderpo> list = 
				(List<TransitReceiveOrderpo>) ois.readObject();
		
		ois.close();
		
		list.add(po);
		System.out.println("success");
		
		FileOutputStream fos = 
				new FileOutputStream
				("src/main/java/data/save/transitReceiveOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		
		return true;
	}

	@Override
	public void approve(String s) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
			ois.close();
			for(int i = 0; i < list.size(); i++){
				if(list.get(i).getID().equals(s))
					list.get(i).ext=ExamineType.Approve;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/courierOrder.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			System.out.println("Approve");
		}catch(Exception e){
				e.printStackTrace();
			}
	}
}
