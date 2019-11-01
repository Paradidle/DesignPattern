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
public class SingletonSync {
	private SingletonSync(){
		
	}
	private static class SingletonSyncFactory{
		public static SingletonSync instance = new SingletonSync();
	}
	
	public static SingletonSync getInstance(){
		return SingletonSyncFactory.instance;
	}

}
