package _3._1._3._2;

public class Test1 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn上面");

			synchronized (lock) {
				System.out.println("syn 第一行");

				lock.wait();

				System.out.println("wait下代码");
			}
			System.out.println("syn下面的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
