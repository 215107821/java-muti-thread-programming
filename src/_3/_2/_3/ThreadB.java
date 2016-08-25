package _3._2._3;

public class ThreadB extends Thread {
	@Override
	public void run() {
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();

			System.out.println("ThreadB.run() end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
