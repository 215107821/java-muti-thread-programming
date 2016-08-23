package _3._4._1;

public class Run {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Main get value = " + Tools.tl.get());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ThreadA a = new ThreadA();
		a.start();
	}
}
