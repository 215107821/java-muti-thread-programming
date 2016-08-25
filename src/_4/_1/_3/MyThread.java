package _4._1._3;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}
}
