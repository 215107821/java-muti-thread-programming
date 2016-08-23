package _2._2._11._1;

public class Run1_1 {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.start();

		ThreadB b = new ThreadB(service);
		b.start();

	}
}
