package _3._1._11._1;

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
				if (!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_" + System.nanoTime();

				System.out.println("set的值是" + value);

				ValueObject.value = value;

				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
