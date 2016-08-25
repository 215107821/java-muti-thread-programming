package _4._1._7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();

			while (hasValue) {
				condition.await();
			}

			System.out.println("set " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

			hasValue = true;

			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void get() {
		try {
			lock.lock();

			while (!hasValue) {
				condition.await();
			}

			System.out.println("get " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

			hasValue = false;

			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
