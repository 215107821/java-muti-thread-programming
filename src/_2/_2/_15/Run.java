package _2._2._15;

import _2._2._15.OutClass.InnerClass1;
import _2._2._15.OutClass.InnerClass2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final InnerClass1 inner1 = new InnerClass1();
		final InnerClass2 inner2 = new InnerClass2();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner1.method1(inner2);
			}
		}, "A");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner1.method2();
			}
		}, "B");

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner2.method1();
			}
		}, "C");

		t1.start();
		t2.start();
		t3.start();
	}
}
