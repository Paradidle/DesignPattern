package gov.services.DesignPattern.abstractAdapter;

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
public class SourceSub1 extends AbstractWrapper{
	@Override
	public void method1(){
		System.out.println("sourcesub1::method1");
	}
}
