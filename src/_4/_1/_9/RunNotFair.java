package _4._1._9;

public class RunNotFair {

	public static void main(String[] args) {

		final Service service = new Service(false);

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				System.out.println("runnable.run()      " + Thread.currentThread().getName() + " "
						+ System.currentTimeMillis());

				service.serviceMethod();
			}
		};

		Thread[] ts = new Thread[10];

		for (int i = 0; i < 10; i++) {
			ts[i] = new Thread(runnable);
		}

		for (int i = 0; i < 10; i++) {
			ts[i].start();
		}
	}
}
