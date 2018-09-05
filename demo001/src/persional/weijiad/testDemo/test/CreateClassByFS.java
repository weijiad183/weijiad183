package persional.weijiad.testDemo.test;

import persional.weijiad.testDemo.bean.TestBean;

/**
 * 通过发射创建对象
 * @author duweijia
 *
 */
public class CreateClassByFS {
	public static void main(String []args){
		try {
			Class c = Class.forName("persional.weijiad.testDemo.bean.TestBean");
			try {
				TestBean bean = (TestBean) c.newInstance();// newInstance其实是构造方法提供
				System.out.println(bean.getStr());
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
