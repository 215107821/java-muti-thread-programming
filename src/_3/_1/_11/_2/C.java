package _3._1._11._2;

/**
 * 消费者
 * 
 * @author Administrator
 * 
 */
public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("")) {
					System.out.println("消费者" + Thread.currentThread().getName() + "waiting了");
					lock.wait();
				}

				System.out.println("消费者" + Thread.currentThread().getName() + "runnable了");
				ValueObject.value = "";
				// lock.notify();
				lock.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
