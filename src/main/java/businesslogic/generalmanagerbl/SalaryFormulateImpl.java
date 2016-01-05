package businesslogic.generalmanagerbl;

import vo.generalmanagervo.SalaryFormulatevo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.generalmanagepo.Salarypo;
import data.salarydata.Salary;
import dataservice.generalmanagerdataservice.SalaryService;
import RMI.host.HostLog;
import blservice.generalmanagerblservice.SalaryFormulateService;

public class SalaryFormulateImpl extends UnicastRemoteObject implements SalaryFormulateService {

	public SalaryFormulateImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryFormulatevo[] showSalary() {
		// TODO Auto-generated method stub
		SalaryService ss = new Salary();
		SalaryFormulatevo[] sfv = new SalaryFormulatevo[7];
		Salarypo[] salary= ss.showSalary();
		if(salary==null){
			for(int i=0;i<7;i++){
				sfv[i]=new SalaryFormulatevo("按月",0);
			}
		}
		else{
		for(int i=0;i<7;i++){		
		SalaryFormulatevo temp =salary[i].getSalary();
			sfv[i]=temp;
		   }
		}
		return sfv;
	}

	public void modifystrategy(SalaryFormulatevo staffs[]) {
		// TODO Auto-generated method stub
		SalaryService ss = new Salary();
		Salarypo salary[] = new Salarypo[7];
		for(int i=0;i<7;i++)
		salary[i]=new Salarypo(staffs[i]);	
	     ss.writesalary(salary);
	     HostLog.addMes("修改薪水策略");
	}
    
}
