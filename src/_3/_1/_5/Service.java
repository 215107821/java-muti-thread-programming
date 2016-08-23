package _3._1._5;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait ");
				lock.wait();
				System.out.println("end wait");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
		}
	}
}
