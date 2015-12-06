package po.bushallsalmanpo;

import vo.bushallsalmanvo.CarMesManagevo;

public class MockCarMespo extends CarMespo{

	public MockCarMespo(CarMesManagevo cm) {
		super(cm);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -5430455624614750434L;
	public int daihao=025001001;
    public String  chepaihao="苏A00001";
    public int year=2015;
    public int month=10;
    public int day=1;
    
//    public MockCarMespo(CarMesManagevo cm){
//    	daihao=d;
//    	chepaihao=c;
//    	year=y;
//    	month=m;
//    	day=da;
//    }
    public int getdaihao(){
    	return daihao;
    }
    public String getchepaihao(){
    	return chepaihao;
    }
    public int getyear(){
    	return year;
    }
    public int getmonth(){
    	return month;
    }
    public int getday(){
    	return day;
    }
}
