package _2._2._7._5;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();

		MyThread1 a = new MyThread1(list);
		a.setName("a");
		a.start();

		MyThread2 b = new MyThread2(list);
		b.setName("b");
		b.start();

		Thread.sleep(6000);

		System.out.println("listSize = " + list.getSize());

	}
}
