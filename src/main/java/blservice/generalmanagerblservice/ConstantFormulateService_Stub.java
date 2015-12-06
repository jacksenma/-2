package blservice.generalmanagerblservice;

import java.rmi.RemoteException;
import java.util.List;

import vo.generalmanagervo.Constancyvo;

public class ConstantFormulateService_Stub implements ConstantFormulateService {

	public Constancyvo showConstancy() {
		System.out.println("显示员工分类信息");
		// TODO Auto-generated method stub
		return null;

	}


	public boolean modifyconstancy(Constancyvo cv) throws RemoteException {
		return false;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addcity(String s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<String> getcity() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deletecity(String s) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void modifycity(String oldc, String newc) throws RemoteException {
		// TODO Auto-generated method stub
		
	}}
