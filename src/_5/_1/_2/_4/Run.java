package _5._1._2._4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static public class MyTaskA extends TimerTask {
		@Override
		public void run() {
				System.out.println("A 运行了！时间为：" + new Date());
				this.cancel();
		}
	}
	
	static public class MyTaskB extends TimerTask {
		@Override
		public void run() {
				System.out.println("B 运行了！时间为：" + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-08-23 14:13:00";

			Timer timer = new Timer();
			Date dateRef = sdf.parse(dateStr);

			System.out.println("字符串时间为：" + dateRef.toLocaleString() + ", 当前时间为：" + new Date().toLocaleString());

			timer.schedule(taskA, dateRef, 4000);
			timer.schedule(taskB, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
