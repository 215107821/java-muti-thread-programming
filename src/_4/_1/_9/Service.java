package _4._1._9;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;

	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("serviceMethod " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis());
		} finally {
			lock.unlock();
		}
	}
}
