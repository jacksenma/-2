package po.bushallsalmanpo;

import java.io.Serializable;

public enum ClExamineType implements Serializable {
	
	Approve , NotApprove , NOApproval;
        
        public String toString() {
            if(this == Approve) return "审批通过";
            else if(this == NotApprove) return "不通过";
            else return "未审批";
        }
        
        public static void main(String[] args) {
        	ClExamineType cle = ClExamineType.NotApprove;
        	System.out.println(cle.toString());
        }

}
