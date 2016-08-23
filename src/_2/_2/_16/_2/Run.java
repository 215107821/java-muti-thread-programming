package _2._2._16._2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		UserInfo userInfo = new UserInfo();

		ThreadA a = new ThreadA(service, userInfo);
		a.setName("A");
		a.start();

		Thread.sleep(50);

		ThreadB b = new ThreadB(service, userInfo);
		b.setName("B");
		b.start();

	}
}
