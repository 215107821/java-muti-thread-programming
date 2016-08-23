package _3._1._4._3;

public class Test {
	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread b = new NotifyThread(lock);
		b.start();

		SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
		c.start();
	}
}
