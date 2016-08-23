package _2._2._7._4;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			service.add("thread a " + (i + 1));
		}
	}
}
