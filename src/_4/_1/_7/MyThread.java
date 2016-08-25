package _4._1._7;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (i % 100000000 == 99999999) {
				service.set();
			}
		}
	}
}
