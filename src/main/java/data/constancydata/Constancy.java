package data.constancydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Constancypo;
import dataservice.generalmanagerdataservice.GeneralManagerService;

public class Constancy implements GeneralManagerService{

	public boolean writecontancy(Constancypo cp) {
		// TODO Auto-generated method stub
		try{
		FileInputStream fis = 
				new FileInputStream("src/main/java/data/save/constancy.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Constancypo> result = (List<Constancypo>) ois.readObject();
		ois.close();
		result.add(cp);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/constancy.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject(result);
	     oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("success write constancy");
		return true;
	}

	public Constancypo getcontancy(){
		// TODO Auto-generated method stub
			FileInputStream fis;
			try {
				fis = new FileInputStream("src/main/java/data/save/constancy.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Constancypo> result = (List<Constancypo>) ois.readObject();
			ois.close();
			 Constancypo cp =result.get(result.size()-1);
	         return cp;
			}catch(Exception e){
				e.printStackTrace();
			}
	        return null;
	}
	public static void write1() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/constancy.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void write2() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/city.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		write1();
		write2();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/constancy.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
	}

	@Override
	public void addcity(String s) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/city.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<String> result = (List<String>) ois.readObject();
			ois.close();
			result.add(s);
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/city.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success write new city");
		}

	@Override
	public List<String> getcity() {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/city.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<String> result = (List<String>) ois.readObject();
			ois.close();
			System.out.println("Find city");
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deletecity(String s) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/city.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<String> result = (List<String>) ois.readObject();
			ois.close();
			for(int i=0;i<result.size();i++){
			   if(result.get(i).equals(s))
			   result.remove(i);
			   i--;
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/city.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success delete city");
		}


	@Override
	public void modifycity(String oldc, String newc) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/city.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<String> result = (List<String>) ois.readObject();
			ois.close();
	       for(int i=0;i<result.size();i++){
	    	   if(result.get(i).equals(oldc))
	    		   result.remove(i);
	    	   result.add(newc);
	       }
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/city.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success modifyconstancy");
		}
}
