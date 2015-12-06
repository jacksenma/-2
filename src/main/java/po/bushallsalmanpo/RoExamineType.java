package po.bushallsalmanpo;

import java.io.Serializable;

public enum RoExamineType implements Serializable {
	
	Approve , NotApprove , NOApproval;
        
        public String toString() {
            if(this == Approve) return "审批通过";
            else if(this == NotApprove) return "不通过";
            else return "未审批";
        }
        
        public static void main(String[] args) {
        	RoExamineType cme = RoExamineType.NotApprove;
        	System.out.println(cme.toString());
        }

}