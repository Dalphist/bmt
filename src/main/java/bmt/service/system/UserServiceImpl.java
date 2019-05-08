package bmt.service.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bmt.entity.system.SysUser;
import bmt.mapper.UserMapper;

/**
 * Title: UserServiceImpl Description:
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public SysUser selectUserByLoginName(String userName) {
		 return userMapper.selectUserByLoginName(userName);
	}

}
