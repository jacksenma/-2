package po.bushallsalmanpo;

import java.io.Serializable;

import po.courierpo.Datepo;
import po.courierpo.ExamineType;
import vo.bushallsalmanvo.CarLoadingvo;
import vo.couriervo.Datevo;

public class CarLoadingpo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1787547085551519584L;

	public final Datepo date;
	
	public final Datevo date1;
	public final String yingYeTing;
	public final String car;
	public final String chuFaDi;
	public final String destination;
	public final String jianZhuang;
	public final String yaYun;
	public final String yunFei;
	public final String tuoYunDan;
	
	public ClExamineType cle;
	
	public CarLoadingpo(CarLoadingvo cl) {
		// TODO Auto-generated constructor stub
		date1=cl.date;
		date=new Datepo(cl.date.year , cl.date.month , cl.date.day);
		yingYeTing=cl.yingYeTing;
		car=cl.car;
		chuFaDi=cl.chuFaDi;
		destination=cl.destination;
		jianZhuang=cl.jianZhuang;
		yaYun=cl.yaYun;
		yunFei=cl.yunFei;
		tuoYunDan=cl.tuoYunDan;
		
		cle=ClExamineType.NOApproval;
	}


	public ClExamineType getExamineType() {
        return cle;
    }


	public String getID() {
		// TODO Auto-generated method stub
		return car;
	}


	public CarLoadingvo getload() {
		// TODO Auto-generated method stub
		
		return new CarLoadingvo(date1,yingYeTing,car,chuFaDi,destination,jianZhuang,yaYun,yunFei,tuoYunDan);
	}
}
