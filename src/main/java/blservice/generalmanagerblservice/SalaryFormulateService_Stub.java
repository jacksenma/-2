package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

import vo.generalmanagervo.SalaryFormulatevo;

public class SalaryFormulateService_Stub implements SalaryFormulateService {

	public SalaryFormulatevo[] showSalary() {
		// TODO Auto-generated method stub
		System.out.println("显示所有薪水策略信息");
		return null;
	}


	public void modifystrategy(SalaryFormulatevo[] staffs)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
