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
import RMI.host.HostLog;
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
		HostLog.addMes("新增员工");
	}


	public void deleteStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		ss.deleteStaff(new Staffpo(sv));
		HostLog.addMes("删除员工");
	}


	public void modifyStaff(Staffvo oldsv,Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		Staffservice ss = new Staff();
		ss.modifyStaff(new Staffpo(oldsv),new Staffpo(sv));
		HostLog.addMes("修改员工信息");
	}


	public void addInstitution(Institutionvo iv)
			throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.writeInstitution(new Institutionpo(iv));
		HostLog.addMes("新增机构");
	}


	public void deleteInstitution(Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.deleteInstitution(new Institutionpo(iv));
		HostLog.addMes("删除机构");
	}


	public void modifyInstitution(Institutionvo oldiv,Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.modifyInstitution(new Institutionpo(oldiv),new Institutionpo(iv));
		HostLog.addMes("修改机构信息");
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
