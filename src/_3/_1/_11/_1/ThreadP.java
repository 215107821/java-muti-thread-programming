package _3._1._11._1;

public class ThreadP extends Thread {
	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}

	}
}
