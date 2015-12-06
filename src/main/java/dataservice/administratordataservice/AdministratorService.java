package dataservice.administratordataservice;

import po.administratorpo.UserMespo;
import vo.administratorvo.UserAuthorityManagervo;

public interface AdministratorService {

	public boolean writeOrder(UserMespo userMespo)throws Exception;
	 public UserMespo search(String ID) throws Exception ;
//	public boolean delete(UserMespo userMespo)throws Exception;
	public boolean deleteUser(UserMespo userMespo) throws Exception;
//	public boolean changeUser(UserMespo userMespo) throws Exception;
	public boolean changeUser(UserMespo o, UserMespo n) throws Exception;
	public UserMespo[] AllSearch()throws Exception;
	

}
