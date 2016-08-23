package _5._1._2._6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static int i = 0;

	static public class MyTaskA extends TimerTask {
		@Override
		public void run() {
			System.out.println("正常执行了 " + i);
		}
	}

	public static void main(String[] args) {
		while (true) {
			try {
				i++;
				Timer timer = new Timer();
				MyTaskA taskA = new MyTaskA();

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateStr = "2016-08-23 14:13:00";

				Date dateRef = sdf.parse(dateStr);

				timer.schedule(taskA, dateRef);
				timer.cancel();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

	}
}
