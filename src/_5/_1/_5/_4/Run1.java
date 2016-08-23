package _5._1._5._4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

	private static Timer timer = new Timer();

	private static int runCount = 0;

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("1 begin running, time is " + new Date());
				Thread.sleep(5000);
				System.out.println("1   end running, time is " + new Date());

				runCount++;

				if (runCount == 5) {
					timer.cancel();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-08-23 14:13:00";
			Date dateRef = sdf.parse(dateStr);

			System.out.println("dateStr is " + dateStr + ", now is " + new Date().toLocaleString());

			timer.scheduleAtFixedRate(task1, dateRef, 2000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
