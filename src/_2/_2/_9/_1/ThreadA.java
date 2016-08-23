package _2._2._9._1;

public class ThreadA extends Thread {

	@Override
	public void run() {
		Service.printA();
	}
}
