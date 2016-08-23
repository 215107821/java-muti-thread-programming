package _3._1._11._2;

/**
 * 生产者
 * 
 * @author Administrator
 * 
 */
public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产者" + Thread.currentThread().getName() + "waiting了");
					lock.wait();
				}

				System.out.println("生产者" + Thread.currentThread().getName() + "runnable了");

				String value = System.currentTimeMillis() + "_" + System.nanoTime();

				ValueObject.value = value;

				// lock.notify();

				lock.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
