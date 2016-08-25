package _3._2._3;

public class ThreadC extends Thread {

	private ThreadB b;

	public ThreadC(ThreadB b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		b.interrupt();
	}
}
