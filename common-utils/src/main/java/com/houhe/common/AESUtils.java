/**
 * @Company:深圳市后河网互联网金融服务有限公司
 * @Copyright: Copyright (c) 2015 本内容仅限于深圳市后河网互联网金融服务有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 * @author: wei.ou
 * @date 2015年10月22日
 * @version  
 */
package com.houhe.common;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

/**
 * AES加密工具类(ECB模式)
 * @author wei.ou
 * @date 2015年10月22日
 */
public class AESUtils {
	private static final String KEY = "^j)h@t*t_Ws+DFdW";
	//加密算法类型
	private static final String ALGORITHM = "AES";
	//加密算法的模式
	private static final String ALGORITHM_PATTERN = "AES/ECB/PKCS5Padding";
	
	/**
	 * 执行加密，返回Base64
	 * @param cleartext 需要加密的明文，不能为空！
	 * @return String (Base64 Code)
	 * @throws Exception
	 */
	public static String encrypt(String cleartext) throws Exception{
		if(StringUtils.isBlank(cleartext)){
			throw new NullPointerException("明文不能为空！");
		}
		Cipher cipher = getCipher(Cipher.ENCRYPT_MODE);
		byte[] ciphertext = cipher.doFinal(cleartext.getBytes());
		return new String(Base64.encodeBase64(ciphertext, false));
	}
	
	/**
	 * 执行解密
	 * @param ciphertext 无需解base64，不能为空！
	 * @return String 明文
	 * @throws Exception
	 */
	public static String decrypt(String ciphertext) throws Exception{
		if(StringUtils.isBlank(ciphertext)){
			throw new NullPointerException("密文不能为空！");
		}
		Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
		byte[] bytes = Base64.decodeBase64(ciphertext.getBytes());
		bytes = cipher.doFinal(bytes);
		return new String(bytes);
	}
	
	private static SecretKeySpec keyGenerator() throws Exception{
		SecretKeySpec ks = new SecretKeySpec(KEY.getBytes("utf-8"), ALGORITHM);
		return ks;
	}
	
	private static Cipher getCipher(int mode) throws Exception{
		Cipher cipher = Cipher.getInstance(ALGORITHM_PATTERN);
		cipher.init(mode, keyGenerator());
		return cipher;
	}
}