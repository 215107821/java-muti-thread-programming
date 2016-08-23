package _2._2._16._2;

public class ThreadB extends Thread {
	private MyService service;
	private UserInfo userInfo;

	public ThreadB(MyService service, UserInfo userInfo) {
		super();
		this.service = service;
		this.userInfo = userInfo;
	}

	@Override
	public void run() {
		service.testMethod(userInfo);
	}
}
