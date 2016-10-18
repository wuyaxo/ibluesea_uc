package cn.ibluesea.uc.test.dao;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.junit.Test;

import cn.ibluesea.uc.test.BaseTest;

public class TestPasswordHelper extends BaseTest{
	
	@Test
	public void TestPasswordHelper1(){
		
		RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
		
		logger.info(randomNumberGenerator.nextBytes().toHex());
	}

}

