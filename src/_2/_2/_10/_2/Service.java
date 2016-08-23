package _2._2._10._2;

public class Service {
	public static void print(Object object) {
		try {
			synchronized (object) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
