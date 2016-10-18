package cn.ibluesea.uc.commons.utils;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


/***
 * AES 加解密工具类
 * @author Jack
 * 2016年8月12日  上午10:58:10
 */
public class AESTool {

    final static byte[] IV = { 0x0, 0xb, 0x2, 0xf, 0x5, 0xd, 0xf, 0x9, 0xf, 0xa,
			0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };
	
	
	
	/****
	 * AES  加密
	 * @author Jack
	 * 2016年8月12日  上午10:12:39
	 * @param data
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String data, String key)
			throws Exception {
		BASE64Decoder base64Decoder = new BASE64Decoder();
		KeyGenerator kgen = KeyGenerator.getInstance("AES");  
        SecureRandom random =SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(base64Decoder.decodeBuffer(key));
        kgen.init(128, random);
        SecretKey skey = kgen.generateKey();  
        byte[] raw = skey.getEncoded();  
        IvParameterSpec ivParam = new IvParameterSpec(IV);
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");  
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParam);  
		byte[] enBytes = cipher.doFinal(data.getBytes("UTF-8"));
		BASE64Encoder base64Encoder = new BASE64Encoder();
		return base64Encoder.encode(enBytes);
	}

	/***
	 * AES  解密
	 * @author Jack
	 * 2016年8月12日  上午10:13:01
	 * @param data
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String data, String key)
			throws Exception {
		BASE64Decoder base64Decoder = new BASE64Decoder();
		KeyGenerator kgen = KeyGenerator.getInstance("AES"); 		
        SecureRandom random =SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(base64Decoder.decodeBuffer(key));
        kgen.init(128, random);
        SecretKey skey = kgen.generateKey();  
        byte[] raw = skey.getEncoded();  
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");  
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
        IvParameterSpec ivParam = new IvParameterSpec(IV);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParam);
		byte[] deBytes = cipher.doFinal(base64Decoder.decodeBuffer(data));
		return new String(deBytes,"UTF-8");
	}

}
