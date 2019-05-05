package bmt.service;

/**
 * Title: UserService Description:
 * @author Dalphist
 * @date 2019年2月11日
 */
public interface UserService {
	public String getPassword(String username);

	public String getRole(String username);
	
}
