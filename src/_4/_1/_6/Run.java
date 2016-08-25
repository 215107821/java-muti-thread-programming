package _4._1._6;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		MyThread t1 = new MyThread(service);
		MyThread2 t2 = new MyThread2(service);

		t1.start();
		t2.start();

		Thread.sleep(3000);

		service.signalAll1();

	}
}
