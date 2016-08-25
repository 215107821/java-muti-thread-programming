package _4._1._5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();

			System.out.println("awaitA b " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);
			condition.await();
			System.out.println("awaitA e " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();

			System.out.println("awaitB b " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);
			condition.await();
			System.out.println("awaitB e " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();

			System.out.println("signalAll b " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);
			condition.signalAll();
			System.out.println("signalAll e " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);

		} finally {
			lock.unlock();
		}
	}
}
