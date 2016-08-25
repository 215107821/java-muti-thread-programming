package _4._1._3_1;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();

		MyThread t1 = new MyThread(service);

		t1.start();

		while (true) {
			try {
				Thread.sleep(1000);

				System.out.println(t1.getName() + " " + t1.getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
