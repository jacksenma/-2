package blservice.generalmanagerblservice;

import vo.generalmanagervo.Accountvo;

public class AccountQueryService_Stub implements AccountQueryService {

	public Accountvo showAccount() {
		System.out.println("显示银行账户信息");
		return new Accountvo();	
	}

}
