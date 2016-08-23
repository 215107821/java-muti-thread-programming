package _2._3._7._2;

public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("已经发起停止命令了");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
