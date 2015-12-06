package dataservice.generalmanagerdataservice;

import po.generalmanagepo.Salarypo;

public interface SalaryService {
	public boolean writesalary(Salarypo salary[]);

	public Salarypo[] showSalary();
}
