package _2._2._7._3;

public class Service {
	String anyString = new String();

	public void a() {

		try {
			synchronized (anyString) {
				System.out.println("a begin");

				Thread.sleep(3000);

				System.out.println("a end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	synchronized public void b() {
		System.out.println("b begin");
		System.out.println("b end");
	}

}
