package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.Receivevo;

public class ReceiveOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1174406908055977378L;

	public final ReceiveOrderpo1 r1;
	final Zhuangtaipo zt;
	public RoExamineType roe;

	public ReceiveOrderpo(Receivevo re) {
		// TODO Auto-generated constructor stub
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

}
