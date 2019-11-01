package gov.services.DesignPattern.factory;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * <p>
 * 
 * </p>
 * 
 * <p>
 * Copyright: 2019 . All rights reserved.
 * </p>
 * <p>
 * Company: Zsoft
 * </p>
 * <p>
 * CreateDate:2019年11月1日
 * </p>
 * 
 * @author chenyupeng
 * @history Mender:chenyupeng；Date:2019年11月1日；
 */
public class SenderFactory {
	public Sender produce(String type){
		if(StringUtils.equals("mail", type)){
			return new MailSender();
		}else if(StringUtils.equals("sms", type)){
			return new SmsSender();
		}else{
			return null;
		}
	}
}
