package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.SalaryFormulatevo;

public interface SalaryFormulateService extends Remote {
	
	public SalaryFormulatevo[] showSalary() throws RemoteException;

    public void modifystrategy(SalaryFormulatevo staffs[])
    		 throws RemoteException;
    
}
