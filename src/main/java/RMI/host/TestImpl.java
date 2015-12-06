package RMI.host;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI.client.Test;

public class TestImpl extends UnicastRemoteObject implements Test {

	public TestImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String print() {
		// TODO Auto-generated method stub

		System.out.println("hhhhhhhhh");
		return "hhhhhhhh";
	}
	
	public String print(String s) {
		System.out.println(s);
		return s;
	}

}
