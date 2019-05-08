package bmt.service.system;

import bmt.entity.system.SysUser;

/**
 * Title: UserService Description:
 * @author Dalphist
 * @date 2019年2月11日
 */
public interface UserService {
	
	public SysUser selectUserByLoginName(String userName);
	
}
