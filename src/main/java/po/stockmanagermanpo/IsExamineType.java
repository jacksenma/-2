package po.stockmanagermanpo;

import java.io.Serializable;

import po.bushallsalmanpo.ClExamineType;

public enum IsExamineType implements Serializable {
	
	Approve , NotApprove , NOApproval;
        
        public String toString() {
            if(this == Approve) return "审批通过";
            else if(this == NotApprove) return "不通过";
            else return "未审批";
        }
        
        public static void main(String[] args) {
        	IsExamineType cle = IsExamineType.NotApprove;
        	System.out.println(cle.toString());
        }

}
