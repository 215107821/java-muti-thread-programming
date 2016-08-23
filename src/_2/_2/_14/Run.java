package _2._2._14;

import _2._2._14.OutClass.Inner;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method1();
			}
		}, "A");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method2();
			}
		}, "B");

		t1.start();
		t2.start();
	}
}
