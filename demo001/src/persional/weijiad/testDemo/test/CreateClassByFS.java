package persional.weijiad.testDemo.test;

import persional.weijiad.testDemo.bean.TestBean;

/**
 * ͨ�����䴴������
 * @author duweijia
 *
 */
public class CreateClassByFS {
	public static void main(String []args){
		try {
			Class c = Class.forName("persional.weijiad.testDemo.bean.TestBean");
			try {
				TestBean bean = (TestBean) c.newInstance();// newInstance��ʵ�ǹ��췽���ṩ
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
