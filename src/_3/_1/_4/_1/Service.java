package _3._1._4._1;

public class Service {
	public void testMethod(Object lock) {
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
}
