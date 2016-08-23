package _3._4._2;

public class ThreadA extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadA get value = " + Tools.tl.get());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
