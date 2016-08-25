package _4._1._3;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();

		MyThread t1 = new MyThread(service);

		t1.start();
	}
}
