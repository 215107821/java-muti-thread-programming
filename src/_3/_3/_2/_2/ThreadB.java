package _3._3._2._2;

import java.util.Date;

public class ThreadB extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 0; i < 100; i++) {
				if (null == Tools.tl.get()) {
					Tools.tl.set(new Date());
				}

				System.out.println("ThreadB get value = " + Tools.tl.get().getTime());

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
