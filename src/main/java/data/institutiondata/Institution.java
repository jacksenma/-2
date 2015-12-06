package data.institutiondata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Institutionpo;
import dataservice.generalmanagerdataservice.Institutionservice;

public class Institution implements Institutionservice{

	public boolean writeInstitution(Institutionpo ip) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Institution.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Institutionpo> result = (List<Institutionpo>) ois.readObject();
			ois.close();
			result.add(ip);
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/Institution.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();	     
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success write Institution");
			return true;
		}

	public Institutionpo getInstitution(String id) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Institution.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Institutionpo> result = (List<Institutionpo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				System.out.println(result.get(i).getID());
				if(result.get(i).getID().equals(id)){
				System.out.println("Find Institution!");
					return (Institutionpo)result.get(i);
				}
			}
			return null;
			}catch(Exception e){
				e.printStackTrace();
			} 
			return null;
	}

	public void deleteInstitution(Institutionpo ip) {
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Institution.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Institutionpo> result = (List<Institutionpo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				if((((Institutionpo)result.get(i)).getID()).equals(ip.getID())){
					result.remove(i);
					i--;
					System.out.println("Delete Institution");
				}}
			ois.close();
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/Institution.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

	public void modifyInstitution(Institutionpo oldip,Institutionpo ip) {      
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Institution.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Institutionpo> result = (List<Institutionpo>) ois.readObject();
			ois.close();
			for(int i=0;i<result.size();i++){
				if((((Institutionpo)result.get(i)).getID()).equals(oldip.getID())){
					result.remove(i);
				    result.add(ip);
				    System.out.println("Modify Institution!");
				}
				System.out.println("No find old one");
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/Institution.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/Institution.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		write();
		System.out.println("write in");
		FileInputStream fis = new FileInputStream("src/main/java/data/save/Institution.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
	}
}
