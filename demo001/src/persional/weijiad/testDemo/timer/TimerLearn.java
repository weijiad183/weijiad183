package persional.weijiad.testDemo.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * jdk×Ô´øµÄtimerÁ·Ï°
 * @author lenovo
 *
 */
public class TimerLearn {
	public static void main(String []args){
		Timer tt = new Timer();
		tt.schedule(new TimerTask() {
			
			@Override
			public void run() {
				for (int i = 0;i < 10;i++) {
					System.out.println(i);
					try {
						Thread.sleep(5*1000);
						if (i == 5) {
							tt.cancel();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, 5*1000,5*1000);
	}
}
