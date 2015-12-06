package data.salarydata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Constancypo;
import po.generalmanagepo.Salarypo;
import dataservice.generalmanagerdataservice.SalaryService;

public class Salary implements SalaryService{

	public boolean writesalary(Salarypo[] salary) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = 
					new FileInputStream("src/main/java/data/save/salary.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Salarypo[]> result = (List<Salarypo[]>) ois.readObject();
			ois.close();
			result.clear();
			result.add(salary);
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/salary.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(result);
		     oos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("success write salary");
			return true;
		}

	public Salarypo[] showSalary() {
		// TODO Auto-generated method stub
		try{
		FileInputStream fis = 
				new FileInputStream("src/main/java/data/save/salary.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Salarypo[]> result = (List<Salarypo[]>) ois.readObject();
		ois.close();
		return result.get(result.size()-1);
		}catch(Exception e){
			e.printStackTrace();
		} 
		return null;
	}
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/salary.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/salary.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
	}
}
