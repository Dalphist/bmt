package bmt.service.system;

import java.util.List;

import bmt.entity.system.SysUser;

/**
 * Title: UserService Description:
 * @author Dalphist
 * @date 2019年2月11日
 */
public interface SysUserService {
	
	public SysUser selectUserByLoginName(String userName);

	public List<SysUser> selectUserList(SysUser user);
	
}
