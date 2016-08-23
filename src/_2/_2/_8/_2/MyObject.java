package _2._2._8._2;

public class MyObject {
	synchronized public void speedPrintString() {
		System.out.println("speedPrintString getLock time = " + System.currentTimeMillis()
				+ " run ThreadName = " + Thread.currentThread().getName());

		System.out.println("-------------------");

		System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis()
				+ " run ThreadName = " + Thread.currentThread().getName());
	}
}
