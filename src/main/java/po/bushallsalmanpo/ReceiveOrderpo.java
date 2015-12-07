package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Receivevo2;
import vo.couriervo.Datevo;

public class ReceiveOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1174406908055977378L;

	public final ReceiveOrderpo1 r1;
	final Zhuangtaipo zt;
	public RoExamineType roe;
	
	public Datevo date;
	public final String zhongzhuan;
	public final String chufa;
	public final String ID;
	
	public final int zhuangtai;

	public ReceiveOrderpo(Receivevo re) {
		// TODO Auto-generated constructor stub
		date=re.receive1.date;
		zhongzhuan=re.receive1.zhongzhuan;
		chufa=re.receive1.chufa;
		ID=re.receive1.ID;
		zhuangtai=re.receive2.zhuangtai;
		r1=new ReceiveOrderpo1(re.receive1);
		if(re.receive2.zhuangtai==1) zt=Zhuangtaipo.Integrity;
		else if(re.receive2.zhuangtai==2) zt=Zhuangtaipo.Lost;
		else if(re.receive2.zhuangtai==3) zt=Zhuangtaipo.Hurt;
		else zt=null;
		roe=RoExamineType.NOApproval;
	}
	
	public RoExamineType getExamineType() {
        return roe;
    }

	public Receivevo getRecive() {
		// TODO Auto-generated method stub
		Receivevo1 r1=new Receivevo1(date,zhongzhuan,chufa,ID);
		Receivevo2 r2=new Receivevo2(zhuangtai);
		
		return new Receivevo(r1, r2);
	}

}
