package _3._1._4._3;

public class SynNotifyMethodThread extends Thread {
	private Object lock;

	public SynNotifyMethodThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
