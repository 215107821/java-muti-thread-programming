package _4._1._6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();

	private Condition condition1 = lock.newCondition();
	private Condition condition2 = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();

			System.out.println("awaitA b " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);
			condition1.await();
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
			condition2.await();
			System.out.println("awaitB e " + Thread.currentThread().getName() + " " + System.currentTimeMillis()
					% 100000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll1() {
		try {
			lock.lock();

			System.out.println("signalAll1 b " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);
			condition1.signalAll();
			System.out.println("signalAll1 e " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);

		} finally {
			lock.unlock();
		}
	}

	public void signalAll2() {
		try {
			lock.lock();

			System.out.println("signalAll2 b " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);
			condition2.signalAll();
			System.out.println("signalAll2 e " + Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() % 100000);

		} finally {
			lock.unlock();
		}
	}
}
