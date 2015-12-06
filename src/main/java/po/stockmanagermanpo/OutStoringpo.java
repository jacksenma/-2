package po.stockmanagermanpo;

import java.io.Serializable;

import po.courierpo.PackingTypepo;
import vo.stocmanagermanvo.Outstockvo1;
import vo.stocmanagermanvo.Zhuangyunvo;

public class OutStoringpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1709685851857444620L;

	final OutStoringpo1 out1;
	final Zhuangyunpo zy;
	public OsExamineType ose;

	
	public OutStoringpo(Outstockvo1 o1, Zhuangyunvo z) {
		// TODO Auto-generated constructor stub
		out1=new OutStoringpo1(o1.year,o1.month,o1.day,o1.bianhao,o1.destination);
		if(z.zhuangyun == 1) zy = Zhuangyunpo.Plane;
    	else if(z.zhuangyun == 2)
    		zy = Zhuangyunpo.Train;
    	else if(z.zhuangyun == 3)
    		zy = Zhuangyunpo.Car;
    	else zy=null;
		
		ose=OsExamineType.NOApproval;
	}

	public String getID() {
		// TODO Auto-generated method stub
		
		return out1.bianhao;
	}

	

	public OsExamineType getExamineType() {
        return ose;
    }
}
