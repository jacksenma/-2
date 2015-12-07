package po.stockmanagermanpo;

import java.io.Serializable;

import po.courierpo.PackingTypepo;
import vo.stocmanagermanvo.Outstockvo;
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

	final Outstockvo1 out2;
	final Zhuangyunvo zy2;
	
	public OutStoringpo(Outstockvo1 o1, Zhuangyunvo z) {
		// TODO Auto-generated constructor stub
		out2=o1;
		zy2=z;
		
		out1=new OutStoringpo1(o1.year,o1.month,o1.day,o1.bianhao,o1.destination,o1.zhongzhuan);
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

	public Outstockvo getOutstock() {
		// TODO Auto-generated method stub
		return new Outstockvo(out2, zy2);
	}
}
