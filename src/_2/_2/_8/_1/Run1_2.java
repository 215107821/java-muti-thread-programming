package _2._2._8._1;

public class Run1_2 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		MyObject object2 = new MyObject();

		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service, object2);
		b.setName("b");
		b.start();

	}
}
