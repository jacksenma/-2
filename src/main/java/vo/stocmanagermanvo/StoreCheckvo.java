package vo.stocmanagermanvo;

import java.io.Serializable;
import java.util.List;

import po.stockmanagermanpo.InStoringpo;

public class StoreCheckvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5207751139013560124L;
	public String bianhao;
	public String destination;
	public String year;
	public String month;
	public String day;
	public String quhao;
	public String paihao;
	public String jiahao;
	public String weihao;
    
    public StoreCheckvo(String b,String dt,String y,String m,String da,String q,String p,String j,String w){
    	bianhao=b;
    	destination=dt;
    	year=y;
    	month=m;
    	day=da;
    	quhao=q;
    	paihao=p;
    	jiahao=j;
    	weihao=w;

    }
    
    public String getBianhao(){
    	return bianhao;
    }
    
    public String getDestination(){
    	return destination;
    }
    
    public String getQuhao(){
    	return quhao;
    }
    
    public String getPaihao(){
    	return paihao;
    }
    
    public String getJiahao(){
    	return jiahao;
    }
    
    public String getWeihao(){
    	return weihao;
    }
}
