package _2._2._16._2;

public class ThreadA extends Thread {
	private MyService service;
	private UserInfo userInfo;

	public ThreadA(MyService service, UserInfo userInfo) {
		super();
		this.service = service;
		this.userInfo = userInfo;
	}

	@Override
	public void run() {
		service.testMethod(userInfo);
	}
}
