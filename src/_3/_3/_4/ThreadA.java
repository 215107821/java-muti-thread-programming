package _3._3._4;

public class ThreadA extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {

				System.out.println("ThreadA get value = " + Tools.tl.get());

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
