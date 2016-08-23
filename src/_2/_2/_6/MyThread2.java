package _2._2._6;

public class MyThread2 extends Thread {
	private Task task;

	public MyThread2(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();

		task.otherMethod();

	}
}
