package vo.financialmanvo;

import java.io.Serializable;

public class SettlementManagevo implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -8293502044118451162L;
//管理结算
	String date;
	String person;
	String address;
	int money;
	String danwei;
	String shoukuanfang;
	public SettlementManagevo(String da,String danw,String pers,String shou,int mon,String add){
		date=da;
		person=pers;
		address=add;
		money=mon;
		danwei=danw;
		shoukuanfang=shou;
		
	}
	public String getDate(){
		return date;
	}
	public String getPerson(){
		return person;
	}
	public String getAddress(){
		return address;
	}
	public int getMoney(){
		return money;
	}
	public String getDanwei(){
		return danwei;
	}
	public String getShouKuanFang(){
		return shoukuanfang;
	}
	

}
