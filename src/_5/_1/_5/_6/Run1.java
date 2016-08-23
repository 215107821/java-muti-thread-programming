package _5._1._5._6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

	private static Timer timer = new Timer();

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
			System.out.print("1 begin running, time is " + new Date());
			System.out.println("1   end running, time is " + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-08-23 17:13:00";
			Date dateRef = sdf.parse(dateStr);

			System.out.println("dateStr is " + dateStr + ", now is " + new Date().toLocaleString());

			timer.scheduleAtFixedRate(task1, dateRef, 5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
