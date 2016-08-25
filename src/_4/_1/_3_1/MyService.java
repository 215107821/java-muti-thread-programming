package _4._1._3_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();

			System.out.println("A " + Thread.currentThread().getName());
			condition.await();
			System.out.println("B " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
