package bmt.service;

import org.springframework.beans.factory.annotation.Autowired;

import bmt.entity.system.SysUser;
import bmt.mapper.UserMapper;

/**
 * Title: UserServiceImpl Description:
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public SysUser login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
