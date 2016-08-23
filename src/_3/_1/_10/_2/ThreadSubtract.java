package _3._1._10._2;

public class ThreadSubtract extends Thread {
	private Subtract p;

	public ThreadSubtract(Subtract p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		try {
			p.subtract();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
