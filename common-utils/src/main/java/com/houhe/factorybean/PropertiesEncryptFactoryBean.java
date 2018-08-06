/**
 * @Company:深圳市后河网互联网金融服务有限公司
 * @Copyright: Copyright (c) 2015 本内容仅限于深圳市后河网互联网金融服务有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 * @author: wei.ou
 * @date 2015年10月28日
 * @version  
 */
package com.houhe.factorybean;

import java.util.Enumeration;
import java.util.Properties;

import org.springframework.beans.factory.FactoryBean;

import com.houhe.common.AESUtils;



/**
 * 解密用户名、密码
 * @author wei.ou
 */
@SuppressWarnings("rawtypes")
public class PropertiesEncryptFactoryBean implements FactoryBean{
	private Properties properties = new Properties();

	@Override
	public Object getObject() throws Exception {
		StringBuilder strBuilder = new StringBuilder();
		Enumeration<Object> keys = properties.keys();
		while(keys.hasMoreElements()){
			String key = String.valueOf(keys.nextElement());
			strBuilder.append(key);
			strBuilder.append("=");
			strBuilder.append(properties.getProperty(key));
			if(keys.hasMoreElements()){
				strBuilder.append(";");
			}
		}
		return strBuilder.toString();
	}

	@Override
	public Class getObjectType() {
		return Properties.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties inProperties) {
		try {
			Enumeration<Object> keys = inProperties.keys();
			while(keys.hasMoreElements()){
				String key = String.valueOf(keys.nextElement());
				properties.put(key, AESUtils.decrypt(inProperties.getProperty(key)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
