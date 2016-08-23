package _5._1._3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("running, time is " + new Date().toLocaleString());
		}
	}

	public static void main(String[] args) {
		MyTask task = new MyTask();

		Timer timer = new Timer();

		System.out.println("now time is " + new Date().toLocaleString());

		timer.schedule(task, 5000);
	}
}
