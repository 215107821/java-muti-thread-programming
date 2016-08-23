package _2._3._3._1;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		RunThread thread = new RunThread();

		thread.start();

		Thread.sleep(1000);

		thread.setRunnig(false);

		System.out.println("已经赋值为false");

	}
}
