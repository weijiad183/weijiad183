package persional.weijiad.testDemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persional.weijiad.testDemo.TestJunit;

/**
 * ��Ԫ����
 * @author duweijia
 *
 */
public class Junit {
	
	/**
	 * ����ִֻ��һ�Σ���������������֮ǰִ��
	 */
	@BeforeClass
	public static void initMethod(){
		System.out.println("beforeclass����һЩĬ������");
	}
	
	/**
	 * ���Է���ǰִ��һ��
	 */
	@Before
	public void testBefore(){
		System.out.println("before�ڲ��Է���ǰִ��");
	}
	
	/**
	 *	����add 
	 */
	@Test
	public void testAdd(){
		Assert.assertEquals(5, new TestJunit().add(1, 1));
	}
}
