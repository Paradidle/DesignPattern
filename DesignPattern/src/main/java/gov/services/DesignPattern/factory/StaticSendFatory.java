package gov.services.DesignPattern.factory;

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
public class StaticSendFatory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
