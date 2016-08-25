package _4._1._4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();

			System.out.println("await A " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);
			condition.await();
			System.out.println("await B " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signal() {
		try {
			lock.lock();

			System.out.println("signal A " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);
			condition.signal();
			System.out.println("signal B " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);

		} finally {
			lock.unlock();
		}
	}
}
