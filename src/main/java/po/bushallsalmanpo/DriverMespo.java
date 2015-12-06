package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.DriverMesManagevo;
import vo.bushallsalmanvo.Othervo2;

public class DriverMespo implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6597514196184635724L;

	final Commonpo common;
	final Xingbiepo other;
	
	final DmExamineType dme;
	
	public DriverMespo(DriverMesManagevo dm) {
		// TODO Auto-generated constructor stub
		common=new Commonpo(dm.common);
		if(dm.other.xingbie==1) other=Xingbiepo.Man;
		else if(dm.other.xingbie==2) other=Xingbiepo.Woman;
		else other=null;
		
		dme=DmExamineType.NOApproval;
	}

	public DmExamineType getExamineType() {
        return dme;
    }
}
