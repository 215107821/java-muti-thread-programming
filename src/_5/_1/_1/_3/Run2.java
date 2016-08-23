package _5._1._1._3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer中允许有多个TimerTask任务
 * 
 * @date 2016年8月23日 下午1:59:15
 */
public class Run2 {

	private static Timer timer = new Timer();

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
			System.out.println("MyTask1运行了！时间为： " + new Date());
		}
	}

	static public class MyTask2 extends TimerTask {
		@Override
		public void run() {
			System.out.println("MyTask2运行了！时间为： " + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String dateStr1 = "2016-08-23 13:51:00";
			String dateStr2 = "2016-08-23 13:52:00";

			Date dateRef1 = sdf1.parse(dateStr1);
			Date dateRef2 = sdf2.parse(dateStr2);

			System.out.println("字符串 1 时间： " + dateRef1.toLocaleString() + ", 当前时间： "
					+ new Date().toLocaleString());
			System.out.println("字符串 2 时间： " + dateRef2.toLocaleString() + ", 当前时间： "
					+ new Date().toLocaleString());

			timer.schedule(task1, dateRef1);
			timer.schedule(task2, dateRef2);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
