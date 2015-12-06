package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import po.courierpo.CourierOrderpo;
import po.courierpo.ExamineType;

public class Approve {
	
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream
				("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		
		for(int i = 0 ; i < list.size() ; i++){
			list.get(i).ext = ExamineType.Approve;
		}
		
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
	}

}
