package _6._3;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
