package data.safetydata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;
import po.otherdatapo.Staffpo;
import vo.administratorvo.UserAuthorityManagervo;




public class AddaccountIO implements AdministratorService {
	public UserMespo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List< UserMespo> list = (List<UserMespo>) ois.readObject();
		ois.close();
		System.out.println("find"+"111111");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}
	public boolean deleteUser(UserMespo cpo) throws Exception {
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/UserMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<UserMespo> result = (List<UserMespo>) ois.readObject();
			for(int i=0;i<result.size();i++){
				if(((result.get(i)).getID()).equals(cpo.getID())){
					result.remove(i);
					i--;
					System.out.println("Delete Institution");
				}}
			ois.close();
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/UserMes.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		return true;
		
	
	}

	public boolean writeOrder( UserMespo cpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<UserMespo> list = (List<UserMespo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getID().equals(cpo.getID()))
				return false;
		}
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/UserMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/UserMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List< UserMespo> list = (List< UserMespo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).getName() + list.get(i)
			.getID().toString());
		}
	}
	public boolean changeUser(UserMespo oldone,UserMespo newone) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/UserMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<UserMespo> result = (List<UserMespo>) ois.readObject();
			ois.close();
			for(int i=0;i<result.size();i++){
				if(((result.get(i)).getID()).equals(oldone.getID())){
					System.out.println("find old one");
					result.remove(i);
					result.add(newone);
					System.out.println("change");
				}
				System.out.println(" no find old one");}
			
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/UserMes.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		return true;
	}
	@Override
	public UserMespo[] AllSearch() throws Exception {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/UserMes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<UserMespo> result = (List<UserMespo>) ois.readObject();
			ois.close();
			
//			int k=0;
//			for(int i=0;i<result.size();i++){
//				if(result.get(i).role.equals(role)){
//	                    k++;
//				}
//			}
			UserMespo[] up = new UserMespo[result.size()];
//				int p =0;
			for(int i=0;i<result.size();i++){
				
					up[i]=result.get(i);
					
				
			}
			return up;
			}catch(Exception e){
				e.printStackTrace();
			} 
		return null;
	}
	
	

//	public boolean delete(UserMespo userMespo) throws Exception {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
