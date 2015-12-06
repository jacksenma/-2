package po.stockmanagermanpo;

import java.io.Serializable;

import vo.generalmanagervo.Staffvo;
import vo.stocmanagermanvo.StoreCheckvo;

public class StoreCheckpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1918762354701786322L;
	public String bianhao;
	public String destination;
	public String year;
	public String month;
	public String day;
	public String quhao;
	public String paihao;
	public String jiahao;
	public String weihao;
	public String zhongzhuan;
	public StoreCheckpo(StoreCheckvo sv){
		bianhao=sv.bianhao;
		destination=sv.destination;
		quhao=sv.quhao;
		paihao=sv.paihao;
		jiahao=sv.jiahao;
		weihao=sv.weihao;
	}
	
	public StoreCheckvo getHuo() {
		// TODO Auto-generated method stub
		return (new StoreCheckvo(bianhao,destination,year,month,day,quhao,paihao,jiahao,weihao,zhongzhuan));
	}
}
