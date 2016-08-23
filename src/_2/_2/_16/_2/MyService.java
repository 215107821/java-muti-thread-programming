package _2._2._16._2;

public class MyService {

	public void testMethod(UserInfo userInfo) {
		synchronized (userInfo) {
			try {
				System.out.println(Thread.currentThread().getName());

				userInfo.setUsername("asasasas");

				Thread.sleep(3000);

				System.out.println(" end time = " + System.currentTimeMillis());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
