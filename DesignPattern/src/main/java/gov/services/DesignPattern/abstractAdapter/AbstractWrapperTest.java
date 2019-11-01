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
public class AbstractWrapperTest {
	public static void main(String[] args){
		SourceSub1 source1 = new SourceSub1();
		SourceSub2 source2 = new SourceSub2();
		
		source1.method1();
		source1.method2();
		
		source2.method1();
		source2.method2();
	}
}
