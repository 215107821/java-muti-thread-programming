package _3._1._14;

public class DBTools {
	volatile private boolean prevIsA = false;

	synchronized public void backupA() {
		try {
			while (prevIsA) {
				wait();
			}

			for (int i = 0; i < 5; i++) {
				System.out.println("AAAAA");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void backupB() {
		try {
			while (!prevIsA) {
				wait();
			}

			for (int i = 0; i < 5; i++) {
				System.out.println("BBBBB");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
