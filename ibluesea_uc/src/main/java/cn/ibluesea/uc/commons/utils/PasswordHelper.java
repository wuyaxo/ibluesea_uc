package cn.ibluesea.uc.commons.utils;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import cn.ibluesea.uc.model.User;

/**
 * 在创建账户及修改密码时直接把生成密码操作委托给PasswordHelper
 * @author david
 *
 */
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	
	private String algorithmName = "md5";
	
	private final int hashIterations = 2;

	public void encryptPassword(User user) {
		user.setSalt(randomNumberGenerator.nextBytes().toHex());
		
		String newPassword = new SimpleHash(algorithmName, user.getPasswd(),
				ByteSource.Util.bytes(user.getSalt()), hashIterations).toHex();
		user.setPasswd(newPassword);
	}
}
