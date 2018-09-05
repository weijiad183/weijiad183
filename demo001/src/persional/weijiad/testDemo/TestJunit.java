package persional.weijiad.testDemo;

/**
 * 为了联系junit
 * @author duweijia
 *
 */
public class TestJunit {
	
	/**
	 * 加法
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a,int b){
		if (String.valueOf(a) != null && String.valueOf(b) != null) {
			return a+b;
		}
		return 0;
	}
	
	public static void main(String [] args){
		TestJunit junit = new TestJunit();
		System.out.println("hello"+junit.add(1, 4));
	}
}
