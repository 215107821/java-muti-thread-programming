package _3._1._11._1;

public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		P p = new P(lock);
		C c = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC cThread = new ThreadC(c);

		pThread.start();
		cThread.start();
	}
}
