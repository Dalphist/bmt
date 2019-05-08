package bmt.mapper;

import bmt.entity.system.SysUser;

/**
* Title: UserMapper  
* Description:角色Mapper
* @author Dalphist  
* @date 2019年2月11日
 */
public interface UserMapper
{
	public SysUser selectUserByLoginName(String userName);

}
