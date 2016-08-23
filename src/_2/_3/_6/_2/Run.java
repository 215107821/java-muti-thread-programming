package _2._3._6._2;

public class Run {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread[] array = new MyThread[5];

			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}

			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}

			Thread.sleep(1000);

			System.out.println(service.al.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
