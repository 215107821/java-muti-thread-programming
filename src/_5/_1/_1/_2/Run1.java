package _5._1._1._2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 如果执行任务的时间早于当前时间，则立即执行task任务
 * 
 * @date 2016年8月23日 下午1:10:24
 */
public class Run1 {
	private static Timer timer = new Timer();

	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("运行了，时间为：" + new Date());

		}
	}

	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-08-22 21:15:00";
			Date dateRef = sdf.parse(dateStr);

			System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());

			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
