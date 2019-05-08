package bmt.service;

import bmt.entity.system.SysUser;

/**
* Title: LoginService  
* Description:登陆接口
* @author Dalphist  
* @date 2019年4月30日
 */
public interface LoginService {
	
	public SysUser login(String username,String password);
	
}
