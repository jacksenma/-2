package businesslogic.generalmanagerbl;

import po.generalmanagepo.Institutionpo;
import po.otherdatapo.Staffpo;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.institutiondata.Institution;
import data.staffdata.Staff;
import dataservice.generalmanagerdataservice.Institutionservice;
import dataservice.generalmanagerdataservice.Staffservice;
import blservice.generalmanagerblservice.StaffInstitutionManagerService;

public class StaffInstitutionManagerImpl extends UnicastRemoteObject implements StaffInstitutionManagerService {

	public StaffInstitutionManagerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	public Institutionvo showInstitutions(String id)  throws RemoteException{
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		Institutionpo ip = is.getInstitution(id);
		if(ip==null)  return null;
		return ip.getInstitution();
	}


	public Staffvo showStaffRole(String id) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		Staffpo sp = ss.getStaff(id);
		if(sp==null)  return null;
		return sp.getStaff();
	}


	public void addStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		ss.writeStaff(new Staffpo(sv));
	}


	public void deleteStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		ss.deleteStaff(new Staffpo(sv));
	}


	public void modifyStaff(Staffvo oldsv,Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		ss.modifyStaff(new Staffpo(oldsv),new Staffpo(sv));
	}


	public void addInstitution(Institutionvo iv)
			throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.writeInstitution(new Institutionpo(iv));
	}


	public void deleteInstitution(Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.deleteInstitution(new Institutionpo(iv));
	}


	public void modifyInstitution(Institutionvo oldiv,Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.modifyInstitution(new Institutionpo(oldiv),new Institutionpo(iv));
	}


	@Override
	public Staffvo[] searchbyrole(String role) throws RemoteException{
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		Staffpo[] sp = ss.searchbyrole(role);
		if(sp==null)  return null;
		else{
			Staffvo[] sv = new Staffvo[sp.length];
			for(int i=0;i<sp.length;i++){
				Staffvo s = sp[i].getStaff();
				sv[i]= s;
			}
			return sv;
		}	
	}}
