package _2._2._8._2;

public class ThreadA extends Thread {
	private Service service;
	private MyObject object;

	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}

	@Override
	public void run() {
		super.run();

		service.testMethod1(object);
	}
}
