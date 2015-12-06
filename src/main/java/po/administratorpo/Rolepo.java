package po.administratorpo;

import java.io.Serializable;


	public enum Rolepo implements Serializable{
		kdy,yytywy,zzzxywy,zzzxkcgly,ybcwy,gjcwy,zjl,gly;
		public String toString() {
	        if(this == kdy) return "快递员";
	        else if(this == yytywy) return "营业厅业务员";
	        else if(this == zzzxywy) return "中转中心业务员";
	        else if(this == zzzxkcgly) return "中转中心库存管理员";
	        else if(this == ybcwy) return "一般财务员";
	        else if(this == gjcwy) return "高级财务员";
	        else if(this == zjl) return "总经理";
	        else return "管理员";
	        
	    }
	}


