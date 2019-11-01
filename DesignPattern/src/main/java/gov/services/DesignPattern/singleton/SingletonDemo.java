package gov.services.DesignPattern.singleton;

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
public class SingletonDemo {
	private static SingletonDemo singleton = null;
	private SingletonDemo(){
		
	}
	public static SingletonDemo getInstance(){
		if(singleton==null){
			singleton = new SingletonDemo();
		}
		return singleton;
	}
}
