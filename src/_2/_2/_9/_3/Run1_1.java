package _2._2._9._3;

public class Run1_1 {
	public static void main(String[] args) throws InterruptedException {
		Service service1 = new Service();
		Service service2 = new Service();

		ThreadA a = new ThreadA(service1);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service2);
		b.setName("b");
		b.start();

	}
}
