package data.staffdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Institutionpo;
import po.otherdatapo.Staffpo;
import vo.generalmanagervo.Staffvo;
import dataservice.generalmanagerdataservice.Staffservice;

public class Staff implements Staffservice{

	public boolean writeStaff(Staffpo ip) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			result.add(ip);
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/staff.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();	     
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success write Staff");
			return true;
	}

	public Staffpo getStaff(String id) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			for(int i=0;i<result.size();i++){			
				if(result.get(i).getID().equals(id)){
				System.out.println("Find Staff!");
					return (Staffpo)result.get(i);
				}
			}
			return null;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}

	public void deleteStaff(Staffpo ip) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				if((((Staffpo)result.get(i)).getID()).equals(ip.getID())){
					result.remove(i);
					i--;
					System.out.println("Delete staff");
				}}
			ois.close();
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/staff.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

	public void modifyStaff(Staffpo oldip, Staffpo ip) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			for(int i=0;i<result.size();i++){
				if((((Staffpo)result.get(i)).getID()).equals(oldip.getID())){
					result.remove(i);
				    result.add(ip);
				    System.out.println("Modify Staff!");
				}
			}
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/staff.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}	
	}
	
	public Staffpo[] searchbyrole(String role) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			
			int k=0;
			for(int i=0;i<result.size();i++){
				if(result.get(i).role.equals(role)){
	                    k++;
				}
			}
				Staffpo[] sp = new Staffpo[k];
				int p =0;
			for(int i=0;i<result.size();i++){
				if(result.get(i).role.equals(role)){
					sp[p]=result.get(i);
					p++;
				}
			}
			return sp;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}
	
	public Staffpo[] searchAll() {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/staff.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			
				Staffpo[] sp = new Staffpo[result.size()];
			for(int i=0;i<result.size();i++){
					sp[i]=result.get(i);
			}
			return sp;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/staff.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		write();
		System.out.println("write in");
		FileInputStream fis = new FileInputStream("src/main/java/data/save/staff.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Staffpo> list = (List<Staffpo>) ois.readObject();
		ois.close();
	}

	public boolean addInitRenyuan(Staffpo ip) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Initrenyuan.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			result.add(ip);
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/Initrenyuan.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();	     
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success write Staff");
			return true;
	}

	public Staffpo[] AllSearchInitAccount() {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/Initrenyuan.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Staffpo> result = (List<Staffpo>) ois.readObject();
			ois.close();
			
				Staffpo[] sp = new Staffpo[result.size()];
			for(int i=0;i<result.size();i++){
					sp[i]=result.get(i);
			}
			return sp;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}


}
