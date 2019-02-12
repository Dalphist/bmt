package bmt.service;

import org.springframework.beans.factory.annotation.Autowired;

import bmt.mapper.UserMapper;

/**
 * Title: UserServiceImpl Description:
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String getPassword(String username) {
		return userMapper.getPassword(username);
	}

	@Override
	public String getRole(String username) {
		return userMapper.getRole(username);
	}

}
