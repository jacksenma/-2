package businesslogic.generalmanagerbl;

import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import data.constancydata.Constancy;
import dataservice.generalmanagerdataservice.GeneralManagerService;
import po.generalmanagepo.Constancypo;
import RMI.host.HostLog;
import blservice.generalmanagerblservice.ConstantFormulateService;

public class ConstantFormulateImpl extends UnicastRemoteObject implements ConstantFormulateService {

	public ConstantFormulateImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Constancyvo showConstancy(){
		System.out.println("显示常量信息");
		GeneralManagerService gs = new Constancy();
			Constancypo cp = gs.getcontancy();
			if(cp==null){
				return new Constancyvo(0,0);
			}
			else
		return cp.getcontancy();
	}

	public boolean modifyconstancy(Constancyvo cv) {
		// TODO Auto-generated method stub
		System.out.println("write in");
		GeneralManagerService gs = new Constancy();
		try {
			if(gs.writecontancy(new Constancypo(cv))){
				HostLog.addMes("修改常量");
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}

	@Override
	public void addcity(String s) {
		// TODO Auto-generated method stub
		GeneralManagerService gs = new Constancy();
		gs.addcity(s);
	}

	@Override
	public List<String> getcity() {
		// TODO Auto-generated method stub
		GeneralManagerService gs = new Constancy();
		List<String> nothing = new ArrayList<String>();
		nothing.add("nothing");
		if(gs.getcity().equals(null))
	    return nothing;
		else
		return gs.getcity();
	}

	@Override
	public void deletecity(String s) throws RemoteException {
		// TODO Auto-generated method stub
		GeneralManagerService gs = new Constancy();
		gs.deletecity(s);
	}

	@Override
	public void modifycity(String oldc, String newc) throws RemoteException {
		// TODO Auto-generated method stub
		GeneralManagerService gs = new Constancy();
		gs.modifycity(oldc, newc);
	}
	
}
