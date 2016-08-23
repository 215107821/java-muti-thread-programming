package _2._3._3._1;

public class RunThread extends Thread {
	private boolean isRunning = true;

	public boolean isRunnig() {
		return isRunning;
	}

	public void setRunnig(boolean isRunnig) {
		this.isRunning = isRunnig;
	}

	@Override
	public void run() {
		System.out.println("进入Run了");

		while (isRunning) {

		}

		System.out.println("线程被终止了");
	}
}
