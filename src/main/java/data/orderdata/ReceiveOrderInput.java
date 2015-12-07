package data.orderdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.generalmanagerdataservice.OrderService;
import po.courierpo.ExamineType;
import po.transitmanpo.TransitReceiveOrderpo;

public class ReceiveOrderInput implements OrderService{
	
	public static void main(String[] args) throws Exception{
		List<TransitReceiveOrderpo> list = 
				new ArrayList<TransitReceiveOrderpo>();
		FileOutputStream fos = 
				new FileOutputStream
				("src/main/java/data/save/transitReceiveOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
	}

	@Override
	public String[] SearchUnchecked() {
		// TODO Auto-generated method stub
		int count=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/transitReceiveOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<TransitReceiveOrderpo> list = (List<TransitReceiveOrderpo>) ois.readObject();
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
			FileInputStream fis = new FileInputStream("src/main/java/data/save/transitReceiveOrder.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<TransitReceiveOrderpo> list = (List<TransitReceiveOrderpo>) ois.readObject();
			ois.close();
			for(int i = 0; i < list.size(); i++){
				if(list.get(i).getID().equals(s))
					list.get(i).ext=ExamineType.Approve;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/transitReceiveOrder.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		}catch(Exception e){
				e.printStackTrace();
			}
	}


}
