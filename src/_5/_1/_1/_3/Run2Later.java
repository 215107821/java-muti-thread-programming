package _5._1._1._3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask是以队列的方式一个一个被顺序的执行，所以执行的时间有可能和预期的时间不一致，<br>
 * 因为前面的任务有可能消耗的时间较长，则后面的任务运行的时间也会被延迟。
 * 
 * @date 2016年8月23日 下午2:00:00
 */
public class Run2Later {

	private static Timer timer = new Timer();

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("MyTask1 begin 运行了！时间为： " + new Date());
				Thread.sleep(20000);
				System.out.println("MyTask1 end 运行了！时间为： " + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static public class MyTask2 extends TimerTask {
		@Override
		public void run() {
			System.out.println("MyTask2 begin 运行了！时间为： " + new Date());
			System.out.println("MyTask2 ... 运行了！时间为： " + new Date());
			System.out.println("MyTask2 end 运行了！时间为： " + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String dateStr1 = "2016-08-23 13:57:40";
			String dateStr2 = "2016-08-23 13:57:50";

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
