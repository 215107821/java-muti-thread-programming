package _4._1._4;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		MyThread t1 = new MyThread(service);

		t1.start();

		Thread.sleep(3000);

		service.signal();

	}
}
