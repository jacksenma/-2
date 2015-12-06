package businesslogic.generalmanagerbl;

import vo.generalmanagervo.Constancyvo;
import vo.queryvo.QueryOrdervo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.constancydata.Constancy;
import dataservice.generalmanagerdataservice.GeneralManagerService;
import po.generalmanagepo.Constancypo;
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
				return new Constancyvo(0,0,null);
			}
			else
		return cp.getcontancy();
	}

	public boolean modifyconstancy(Constancyvo cv) {
		// TODO Auto-generated method stub
		System.out.println("write in");
		GeneralManagerService gs = new Constancy();
		try {
			if(gs.writecontancy(new Constancypo(cv)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
	
}
