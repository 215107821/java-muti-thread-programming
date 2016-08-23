package _2._2._9._1;

public class ThreadB extends Thread {

	@Override
	public void run() {
		Service.printB();
	}
}
