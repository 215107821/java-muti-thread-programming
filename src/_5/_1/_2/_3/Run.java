package _5._1._2._3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("start 运行了！时间为：" + new Date());
				Thread.sleep(5000);
				System.out.println("end   运行了！时间为：" + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-08-23 14:13:00";

			Timer timer = new Timer();
			Date dateRef = sdf.parse(dateStr);

			System.out.println("字符串时间为：" + dateRef.toLocaleString() + ", 当前时间为：" + new Date().toLocaleString());

			timer.schedule(task, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
