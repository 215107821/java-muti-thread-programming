package _3._1._1;

public class ThreadB extends Thread {
	private MyList list;

	public ThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (list.size() == 5) {
					System.out.println("==5了，线程b要退出了");
					throw new InterruptedException();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
