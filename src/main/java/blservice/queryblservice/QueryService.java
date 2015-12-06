package blservice.queryblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

public interface QueryService extends Remote {
    
    public QueryOrdervo checkOrder(Queryvo qvo) throws RemoteException;
     
    public boolean isValid(String s) throws RemoteException;

}