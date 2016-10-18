package cn.ibluesea.uc.test.dao;

import java.util.UUID;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import cn.ibluesea.uc.commons.utils.PasswordHelper;
import cn.ibluesea.uc.model.User;

public class TestPasswordHelper{
	
	@Test
	public void TestPasswordHelper1(){
		User u= new User();
		u.setUserName("test");
		u.setSalt("779fe02c417d4af79e395111d9b2bb8e");
		u.setPasswd("123");
		PasswordHelper passhelper=new PasswordHelper();
		passhelper.encryptPassword(u);
		System.out.println(JSON.toJSON(u));
		
	}
	
	@Test
	public void TestUUID(){
		
		UUID uid=new UUID(0, 0).randomUUID();
		System.out.println(uid.toString().replaceAll("-", ""));
	}

}

