package gov.services.DesignPattern.adapter;

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
public class Wrapper implements Targetable{
	private Source source;

	public Wrapper(){
		super();
		source = new Source();
	}
	public void method1() {
		source.method1();
	}

	public void method2() {
		System.out.println("target::method2");
	}
	
}
