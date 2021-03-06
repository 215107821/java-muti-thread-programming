package _3._1._9._2;

public class MyRun {
	private String lock = new String("");

	private Runnable runnableA = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end wait");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	private Runnable runnableB = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin notify");
					lock.notify();
					System.out.println("end notify");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		MyRun run = new MyRun();
		Thread b = new Thread(run.runnableB);
		b.start();

		Thread.sleep(100);

		Thread a = new Thread(run.runnableA);
		a.start();

	}
}
