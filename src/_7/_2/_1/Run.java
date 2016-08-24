package _7._2._1;

public class Run {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();

		ThreadGroup g = new ThreadGroup("g");

		Thread t1 = new Thread(g, a);
		Thread t2 = new Thread(g, b);

		t1.start();
		t2.start();

		System.out.println("活动的线程数：" + g.activeCount());
		System.out.println("线程组名称：" + g.getName());
	}
}
