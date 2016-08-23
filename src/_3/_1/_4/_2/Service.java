package _3._1._4._2;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait");
				Thread.sleep(40000);
				System.out.println("end wait");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
