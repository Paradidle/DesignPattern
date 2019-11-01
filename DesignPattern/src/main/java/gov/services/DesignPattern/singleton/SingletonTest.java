package gov.services.DesignPattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class SingletonTest {
	public static void main(String[] args){
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i = 0;i<=500;i++){
			executorService.execute(new ThreadGetInstance());
		}
		executorService.shutdown();
	}
	static class ThreadGetInstance implements Runnable{
		public void run() {
			System.out.println(SingletonSync.getInstance());
		}
	}
}
