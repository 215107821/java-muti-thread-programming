package _2._3._6._2;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	public static AtomicLong al = new AtomicLong();

	synchronized public void addNum() {
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + al.addAndGet(100));

		al.addAndGet(1);
	}
}
