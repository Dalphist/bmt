package bmt.service.system;

import bmt.entity.system.SysUser;

/**
 * Title: UserService Description:
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
public interface SysPasswordService {

	public void validate(SysUser user, String password);

	public boolean matches(SysUser user, String newPassword);

	public void clearLoginRecordCache(String username);

	public String encryptPassword(String username, String password, String salt);
}
