package cn.ibluesea.uc.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import cn.ibluesea.uc.model.User;
import cn.ibluesea.uc.service.impl.UserServiceImpl;
import cn.ibluesea.uc.test.BaseTest;

public class TestDao extends BaseTest {

	@Autowired
	private UserServiceImpl userService;

	@Test
	public void TestgetUser() {
		String userId = "e926b19294e511e6ae1a7824af9c115a";
		logger.info(JSON.toJSON(userService.getUserInfo(userId)));
	}
	
	@Test
	public void TestgetUserByName(){
		String userName = "test", password = "ba6b2a65d38a92c3d2584cd4874ceed0";
		User u=userService.findByUsername(userName);
		logger.info(JSON.toJSON(u));
	}
}
