package _2._2._10._2;

public class Run1_1 {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();

	}
}
