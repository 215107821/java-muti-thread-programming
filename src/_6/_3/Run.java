package _6._3;

public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			MyThread thread = new MyThread();
			thread.start();
		}
	}
}
