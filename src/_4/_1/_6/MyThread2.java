package _4._1._6;

public class MyThread2 extends Thread {

	private MyService service;

	public MyThread2(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}
