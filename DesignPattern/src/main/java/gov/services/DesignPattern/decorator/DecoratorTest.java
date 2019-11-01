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
public class DecoratorTest {
	public static void main(String[] args){
		Sourceable source = new SourceImpl();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
