package po.stockmanagermanpo;

import java.io.Serializable;

import po.bushallsalmanpo.ClExamineType;
import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.StoreCheckvo;
import vo.stocmanagermanvo.Weizhivo;

public class InStoringpo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3668577120125954843L;
    final Kuaidipo kuaidi;
    final Weizhipo weizhi;
    public IsExamineType ise;
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
	
	public InStoringpo(Kuaidivo kd,Weizhivo wz) {
		// TODO Auto-generated constructor stub
		kuaidi = new Kuaidipo(kd.year,kd.month,kd.day,kd.bianhao,kd.destination);
		weizhi = new Weizhipo(wz.quhao,wz.paihao,wz.jiahao,wz.weihao,wz.zhongzhuan);
		ise=IsExamineType.NOApproval;
		bianhao=kd.bianhao;
		destination=kd.destination;
		year=kd.year;
		month=kd.month;
		day=kd.day;
		quhao=wz.quhao;
		paihao=wz.paihao;
		jiahao=wz.jiahao;
		weihao=wz.weihao;
		zhongzhuan=wz.zhongzhuan;
	}
	
	public Kuaidipo getKuaidi(){
		return kuaidi;
	}
	
	public Weizhipo getWeizhi(){
		return weizhi;
	}

	public String getID() {
		
		// TODO Auto-generated method stub
		return kuaidi.bianhao;
		
	}
	
	public String getZhongzhuan(){
		return weizhi.zhongzhuan;
	}

	public IsExamineType getExamineType() {
        return ise;
    }

	public StoreCheckvo getHuo() {
		// TODO Auto-generated method stub
		return (new StoreCheckvo(bianhao,destination,year,month,day,quhao,paihao,jiahao,weihao,zhongzhuan));
		
	}


	

}
