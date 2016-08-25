package _3._2._3;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (i % 100000000 == 99999999) {
				System.out.println("ThreadA.run() i = " + i);
			}
		}

	}
}
