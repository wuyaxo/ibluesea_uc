package cn.ibluesea.uc.test.dao;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import cn.ibluesea.uc.test.BaseTest;

public class TestUserLogin extends BaseTest {

	@Test
	public void testShiroLogin() {

		String username = "test", password = "123";

		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		Subject currentUser = SecurityUtils.getSubject();

		currentUser.login(token);

	}
}
