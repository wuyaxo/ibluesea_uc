package cn.ibluesea.uc.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ibluesea.uc.dao.UserMapper;
import cn.ibluesea.uc.model.User;
import cn.ibluesea.uc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserInfo(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(String userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correlationRoles(String userId, String roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncorrelationRoles(Long userId, String roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findRoles(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findPermissions(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
