package _2._2._9._1;

public class Run1_1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB();
		b.setName("b");
		b.start();

	}
}
