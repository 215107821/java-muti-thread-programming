package _3._3._2._2;

public class Run {

	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB();
			b.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
