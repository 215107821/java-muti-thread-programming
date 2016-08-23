package _3._3._2._2;

import java.util.Date;

public class ThreadA extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 0; i < 20; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set(new Date());
				}

				System.out.println("ThreadA get value = " + Tools.tl.get().getTime());

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
