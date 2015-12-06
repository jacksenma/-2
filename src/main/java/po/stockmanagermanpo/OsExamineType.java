package po.stockmanagermanpo;

import java.io.Serializable;

import po.bushallsalmanpo.ClExamineType;

public enum OsExamineType implements Serializable {
	
	Approve , NotApprove , NOApproval;
        
        public String toString() {
            if(this == Approve) return "审批通过";
            else if(this == NotApprove) return "不通过";
            else return "未审批";
        }
        
        public static void main(String[] args) {
        	OsExamineType cle = OsExamineType.NotApprove;
        	System.out.println(cle.toString());
        }

}
