package data.orderdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.transitmanpo.TransitReceiveOrderpo;

public class ReceiveOrderInput {
	
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

}
