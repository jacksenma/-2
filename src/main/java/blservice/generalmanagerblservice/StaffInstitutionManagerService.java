package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

public interface StaffInstitutionManagerService extends Remote {
	
       public Staffvo showStaffRole(String id) throws RemoteException;
       
       public Institutionvo showInstitutions(String id) throws RemoteException;
       
       public Staffvo[] searchbyrole(String role) throws RemoteException;
       
       public Staffvo addStaff(Staffvo sv)
    		   throws RemoteException;
       
       public void deleteStaff(Staffvo sv)
    		   throws RemoteException;
       
       public void modifyStaff(Staffvo oldsv,Staffvo sv)
    		   throws RemoteException;
       
       public Institutionvo addInstitution(Institutionvo iv)
    		   throws RemoteException;
       
       public void deleteInstitution(Institutionvo iv) throws RemoteException;
 
       public void modifyInstitution(Institutionvo oldiv,Institutionvo iv) throws RemoteException;
}
