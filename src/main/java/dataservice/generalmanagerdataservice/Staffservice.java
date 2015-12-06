package dataservice.generalmanagerdataservice;

import po.otherdatapo.Staffpo;
import vo.generalmanagervo.Staffvo;

public interface Staffservice {
		boolean writeStaff(Staffpo ip);
		Staffpo getStaff(String id);
		void deleteStaff(Staffpo ip);
		void modifyStaff(Staffpo oldip,Staffpo ip);
		Staffpo[] searchbyrole(String role);
}
