package persional.weijiad.testDemo.thread;

/**
 * 
 * ���߳���ϰ
 * @author duweijia
 *
 */
public class ThreadLearn implements Runnable{
	public ThreadLearn (String name) {
		this.name = name;
	}
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	static String ys = "dwj";
	static int tickets = 20;
	@Override
	public void run() {
		while (tickets > 0) {
			synchronized (ys) {
				if (tickets > 0) {
					System.out.println(getName()+tickets);
					tickets --;
				} else {
					System.out.println("Ʊ������");
				}
			}
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String []args){
		ThreadLearn t1 = new ThreadLearn("��1");
		ThreadLearn t2 = new ThreadLearn("��2");
	}
}
