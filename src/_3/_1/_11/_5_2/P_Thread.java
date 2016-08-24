package _3._1._11._5_2;

public class P_Thread extends Thread {
	private P p;

	public P_Thread(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.pushService();
		}
	}
}
