package persional.weijiad.testDemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persional.weijiad.testDemo.TestJunit;

/**
 * 单元测试
 * @author duweijia
 *
 */
public class Junit {
	
	/**
	 * 类中只执行一次，并且在其他方法之前执行
	 */
	@BeforeClass
	public static void initMethod(){
		System.out.println("beforeclass加载一些默认配置");
	}
	
	/**
	 * 测试方法前执行一次
	 */
	@Before
	public void testBefore(){
		System.out.println("before在测试方法前执行");
	}
	
	/**
	 *	测试add 
	 */
	@Test
	public void testAdd(){
		Assert.assertEquals(5, new TestJunit().add(1, 1));
	}
}
