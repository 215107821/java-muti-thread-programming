package _7._2._1;

public class ThreadA extends Thread {

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				System.out.println("A: " + Thread.currentThread().getName());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
