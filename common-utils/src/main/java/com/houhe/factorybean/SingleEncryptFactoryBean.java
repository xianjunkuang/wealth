/**
 * @Company:深圳市后河网互联网金融服务有限公司
 * @Copyright: Copyright (c) 2015 本内容仅限于深圳市后河网互联网金融服务有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 * @author: wei.ou
 * @date 2015年10月29日
 * @version  
 */
package com.houhe.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.houhe.common.AESUtils;

/**
 * 单一的属性解密
 * @author wei.ou
 */
@SuppressWarnings("rawtypes")
public class SingleEncryptFactoryBean implements FactoryBean{
	private String value;

	@Override
	public Object getObject() throws Exception {
		return getValue();
	}

	@Override
	public Class getObjectType() {
		return String.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		try {
			this.value = AESUtils.decrypt(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}