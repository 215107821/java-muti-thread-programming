package _2._3._7._1;

public class Service {
	private boolean isContinueRun = true;

	public void runMethod() {
		while (isContinueRun) {

		}

		System.out.println("停下来了");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
