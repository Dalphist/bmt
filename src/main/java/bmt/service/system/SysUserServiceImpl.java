package bmt.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bmt.common.annotation.DataScope;
import bmt.entity.system.SysUser;
import bmt.mapper.UserMapper;

/**
 * Title: UserServiceImpl Description:
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public SysUser selectUserByLoginName(String userName) {
		 return userMapper.selectUserByLoginName(userName);
	}

	@Override
	@DataScope(tableAlias = "u")
	public List<SysUser> selectUserList(SysUser user) {
		return userMapper.selectUserList(user);
	}

}
