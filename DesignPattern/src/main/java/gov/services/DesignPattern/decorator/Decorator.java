package gov.services.DesignPattern.decorator;

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
public class Decorator implements Sourceable {
	private Sourceable source;
	
	public Decorator(Sourceable source){
		super();
		this.source = source;
	}
	public void method() {
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
	
}
