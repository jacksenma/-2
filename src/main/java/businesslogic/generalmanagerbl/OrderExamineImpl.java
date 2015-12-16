package businesslogic.generalmanagerbl;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.institutiondata.BusinessHall;
import data.orderdata.OrderIO;
import data.orderdata.ReceiveOrderInput;
import data.reformdata.PaymentListIO;
import data.warehousedata.Storing;
import dataservice.generalmanagerdataservice.OrderService;
import blservice.generalmanagerblservice.OrderExamineService;

public class OrderExamineImpl extends UnicastRemoteObject implements OrderExamineService {


	public OrderExamineImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] showexpressorder() throws RemoteException {
		// TODO Auto-generated method stub
		OrderService os= new OrderIO();
		return os.SearchUnchecked();
	}

	@Override
	public String[] showcarloadingorder() throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		return  bh.SearchUncheckedcar();
	}

	@Override
	public String[] showyingyetingorder() throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		return bh.SearchUncheckedbushall();
	}

	@Override
	public String[] showshoukuanorder() throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		return bh.SearchUncheckedcash();
	}

	@Override
	public String[] showzhongzhuanorder() throws RemoteException {
		// TODO Auto-generated method stub
		OrderIO os = new OrderIO();
		return os.SearchUncheckedtraffic();
	}

	@Override
	public String[] showpaijianorder() throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		return bh.SearchUncheckedsend();
	}

	@Override
	public String[] showzhongzhuanzhongxinorder() throws RemoteException {
		// TODO Auto-generated method stub
		OrderService os= new ReceiveOrderInput();
		return os.SearchUnchecked();
	}

	@Override
	public String[] showinstockorder() throws RemoteException {
		// TODO Auto-generated method stub
		Storing s = new Storing();
		return s.SearchUncheckedinstock();
	}

	@Override
	public String[] showoutstockorder() throws RemoteException {
		// TODO Auto-generated method stub
		Storing s = new Storing();
		return s.SearchUncheckedoutstock();
	}

	@Override
	public String[] showpaymentorder() throws RemoteException {
		// TODO Auto-generated method stub
		OrderService os= new PaymentListIO();
		return os.SearchUnchecked();
	}

	@Override
	public void approveexpressorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		OrderService os = new OrderIO();
		os.approve(ID);
	}

	@Override
	public void approvecarloadingorde(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		bh.approvecar(ID);
	}

	@Override
	public void approveyingyetingorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		bh.approveyingyetingorder(ID);
	}

	@Override
	public void approvecarshoukuanorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		bh.approveshoukuanorder(ID);
	}

	@Override
	public void approvezhongzhuanorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		OrderIO os = new OrderIO();
	   os.approvetraffic(ID);
	}

	@Override
	public void approvepaijianorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		BusinessHall bh = new BusinessHall();
		bh.approvesendorder(ID);
	}

	@Override
	public void approvezhongzhuanzhongxinorder(String ID)
			throws RemoteException {
		// TODO Auto-generated method stub
		OrderService os= new ReceiveOrderInput();
		os.approve(ID);
	}

	@Override
	public void approveinstockorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		Storing s = new Storing();
		s.approveinstock(ID);
	}

	@Override
	public void approveoutstockorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		Storing s = new Storing();
		s.approveoutstock(ID);
	}

	@Override
	public void approvepaymentorder(String ID) throws RemoteException {
		// TODO Auto-generated method stub
	OrderService os = new PaymentListIO();
		os.approve(ID);
	}




}

